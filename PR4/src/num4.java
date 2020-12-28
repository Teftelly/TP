public class num4{
	public static void main(String[] args) { 
		System.out.println("#1 " + Bessy(10, 7, "hello my name is Bessie and this is my essay") + ".\n");
		
		System.out.println("#2 " + split("()()()") + ";\n   " + split("((()))") + ";\n   " + split("((()))(())()()(()())") + ";\n   " + split("((())())(()(()()))") + ".\n");
		
		System.out.println("#3 " + toCamelCase("hello_edabit") + "; " + toSnakeCase("helloEdabit") + "; " + toCamelCase("is_modal_open") + "; " + toSnakeCase("getColor") + ".\n");
		
		double  [] arr4_1= {9, 17, 30, 1.5};
		double  [] arr4_2= {16, 18, 30, 1.8};
		double  [] arr4_3= {13.25, 15, 30, 1.5};
		System.out.println("#4 " + overTime(arr4_1) + "\n   " + overTime(arr4_2) + "\n   " + overTime(arr4_3) + "\n");
		
		System.out.println("#5 " + BMI("205 pounds", "73 inches") + "; " + BMI("55 kilos", "1.65 meters") + "; " + BMI("154 pounds", "2 meters") + ".\n");
		
		System.out.println("#6 " + bugger(39) + "; " + bugger(999) + "; " + bugger(4) + ".\n");

		System.out.println("#7 " + toStarShorthand("abbccc") + "; " + toStarShorthand("77777geff") + "; " + toStarShorthand("abc") + "; " + toStarShorthand("") + ".\n");
		
		System.out.println("#8 " + doesRhyme("Sam I am!", "Green eggs and ham.") + "; " + doesRhyme("Sam I am!", "Green eggs and HAM.") + "; " + doesRhyme("You are off to the races", "a splendid day.") + "; " + doesRhyme("and frequently do?", "you gotta move.") + ".\n");
		
		System.out.println("#9 " + trouble(451999277, 41177722899L) + "; " + trouble(1222345, 12345) + "; " + trouble(666789, 12345667) + "; " + trouble(33789, 12345337) + ".\n");
	
		System.out.println("#10 " + countUniqueBooks("AZYWABBCATTTA", 'A') + "; " + countUniqueBooks("$AA$BBCATT$C$$B$", '$') + "; " + countUniqueBooks("ZZABCDEF", 'Z') + ".\n");
		
	}
	//#1
	private static String Bessy(int n, int k, String str) {
		String essey = new String();
		String[] word = new String[n];
		int j = 0;
		int i = 0;
		while (i < n) {
			if (str.indexOf(32, j) == -1)
				word[i] = str.substring(j, str.length());
			else {
			word[i] = str.substring(j, str.indexOf(32, j));
			j = str.indexOf(32, j)+1;}
			i++;
		}
		i = 0;
		j = 0;
		while (i < n) {
			if (j + word[i].length() <= k) {
				if (j == 0)
					essey = essey + word[i];
				else
					essey = essey + ' ' + word[i];
				j = j + word[i].length();
				i++;
			}
			else {
				j = 0;
				essey = essey + '\n';
			}
		}
		return essey;
	}
	//#2
	private static String split(String str) {
		StackTraceElement[] STE=Thread.currentThread().getStackTrace();
		int b = 0;
		if(STE.length < 4) 
			for(int i = 0; i< STE.length;i++) 
				if (STE[i].getMethodName() == "split")
					b++;
		if (b == 1)
			return "[" + split(str) + "]";
		if (str.length() > 1) {
		int a = str.length()-1;
		int flag = 0;
		do {
			if (str.charAt(a) == '(')
				flag++;
			if (str.charAt(a) == ')')
				flag--;
			a--;
			} while ((a > 0) && ((str.charAt(a) != '(') || (flag + 1 != 0)));
		if (a > 0)
			return split(str.substring(0, a )) + ", " +  '"' + str.substring(a , str.length()) + '"';
		else
			return  '"'+  str + '"';
		}
			return str;
	}
	//#3
	private static String toCamelCase(String str) {
		String word = new String();
		if (str.indexOf("_") != -1) {
			word = str.substring(str.indexOf("_") + 1);
			return str.substring(0, str.indexOf("_")) + toCamelCase(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());
		}
		else {
			word = str.substring(str.indexOf("_") + 1);
			return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		}
	}
	private static String toSnakeCase(String str) {
        char[] newstr = str.toCharArray();
        str = "";
        for (int i = 0; i < newstr.length; i++) {
            if (Character.isUpperCase(newstr[i])) {
                str += "_" + Character.toLowerCase(newstr[i]);
            } else
                str += newstr[i];
        }
        return str;
	}
	//#4
	public static String overTime (double a[]) {
        String dolar = "$";
        double s = 0;
        if (a[1] > 17) {
            s = a[1] - 17;
            s = (a[1] - a[0] - s) * a[2] + (s * 30 * a[3]);
        } 
        else {
            s = (a[1] - a[0]) * a[2];
        }
        return dolar + String.format("%.2f", s);
    }

	//#5
	public static String BMI(String str1, String str2) {
        double ves = Double.parseDouble(str1.substring(0, str1.indexOf(' ')));
        if (str1.endsWith("pounds")) {
            ves = ves * 0.453592;
        }
        double rost = Double.parseDouble(str2.substring(0, str2.indexOf(' ')));
        if (str2.endsWith("inches")) {
            rost = rost * 0.0254;
        }
        double IBM = ves / Math.pow(rost, 2);
        if (IBM < 18.5) {
            return String.format("%.1f", IBM) + " Underweight";
        }
        else if(IBM<24.9)
            return String.format("%.1f", IBM)+ " Normal weight";
        else
            return String.format("%.1f", IBM)+ " Overweight";
    }
	
	//#6
    public static int bugger(int n) {
        String str = "" + n;
        int sum = 0;
        int s = 0;
        while (str.length() > 1) {
            sum = 1;
            for (int i = 0; i < str.length(); i++) {
               sum = sum * Integer.parseInt("" +str.charAt(i));
            }
            s++;
            str = "" + sum;
        }
        return s;
    }

	//#7
    public static String toStarShorthand(String str) {
        if(str=="")
            return "";
        char save = str.charAt(0); 
        int kol = 1;
        String newst = "";
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i) != save)
            {
                if(kol>1)
                {
                    newst += ""+save+ "*"+ kol;
                }
                else
                    newst += ""+save;
                kol = 1;
                if(i!=str.length()-1)
                    save = str.charAt(i);
                else
                    newst+=str.charAt(i);
            }
            else
            {
                kol++;
                if(i== str.length()-1)
                {
                    newst += ""+save+ "*"+ kol;
                }
            }
        }
        return newst;
    }

	//#8
    public static boolean doesRhyme(String str1, String str2) {
        String s1 = "", s2 = "";
        char v = ' ';
        str1 = str1.substring(str1.lastIndexOf(" ") + 1);
        for (int i = 0; i < str1.length(); i++) {
            v = Character.toLowerCase(str1.charAt(i));
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || v == 'y') {
                s1 += v;
            }
        }
        str2 = str2.substring(str2.lastIndexOf(" ") + 1);
        for (int i = 0; i < str2.length(); i++) {
            v = Character.toLowerCase(str2.charAt(i));
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || v == 'y') {
                s2 += v;
            }
        }
        return s1.equals(s2);
    }

	//#9
    public static boolean trouble(long a, long b) {
        String str1 = "" + a;
        String str2 = "" + b;
        int kol = 0, kol2 = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (i != str1.length() - 1) {
                if (str1.charAt(i) == str1.charAt(i + 1))
                    kol++;
                else
                    kol = 0;
                
                if (kol == 2) {
                    
                    for (int j = 0; j < str2.length(); j++) {
                        if (str1.charAt(i) == str2.charAt(j)) {
                            kol2++;
                        } else {
                            kol2 = 0;
                        }
                        if (kol2 == 2) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

	//#10
    public static int countUniqueBooks(String str, char ch) {
        String newstr1 = "";
        String newstr2 = "";
        String fin = "";
        int ind1 = 0, ind2 = 0;
        while (str.length() != 0) {
            if (str.indexOf(ch) != -1) {
                newstr1 = str.substring(str.indexOf(ch) + 1);
                ind1 = str.indexOf(ch) + 1;
                str = str.substring(ind1);
            }
            if (newstr1.indexOf(ch) != -1) {
                newstr2 = newstr1.substring(0, newstr1.indexOf(ch));
                ind2 = newstr1.indexOf(ch) + 1;
                str = str.substring(ind2);
            }
            for (int i = 0; i < newstr2.length(); i++) {
                if (fin.indexOf(newstr2.charAt(i)) == -1) {
                    fin += newstr2.charAt(i);
                }
            }
        }
        return fin.length();
    }

}