public class num2{
	public static void main(String[] args) { 
		System.out.println("#1 " + repeat("mice", 5) + "; " + repeat("hello", 3) + "; " + repeat("stop", 1) + ".\n");
		
		int [] arr2_1= {10, 4, 1, 4, -10, -50, 32, 21};
		int [] arr2_2= {44, 32, 86, 19};
		System.out.println("#2 " + differenceMaxMin(arr2_1) + "; " + differenceMaxMin(arr2_2) + ".\n");
		
		int [] arr3_1= {1, 3};
		int [] arr3_2= {1, 2, 3, 4};
		int [] arr3_3= {1, 5, 6};
		int [] arr3_4= {1, 1, 1};
		int [] arr3_5= {9, 2, 2, 5};
		System.out.println("#3 " + isAvgWhole(arr3_1) + "; " + isAvgWhole(arr3_2) + "; " + isAvgWhole(arr3_3) + "; " + isAvgWhole(arr3_4) + "; " + isAvgWhole(arr3_5) + ".\n");
		
		int [] arr4_1= {1, 2, 3};
		int [] arr4_2= {1, -2, 3};
		int [] arr4_3= {3, 3, -2, 408, 3, 3};
		System.out.println("#4 " + IntArr_ToStr(arr4_1) + "; " + IntArr_ToStr(arr4_2) + "; " + IntArr_ToStr(arr4_3) + ".\n");
		
		System.out.println("#5 " + getDecimalPlaces("43.20") + "; " + getDecimalPlaces("400") + "; " + getDecimalPlaces("3.1") + ".\n");
		
		System.out.println("#6 " + Fibonacci(3) + "; " + Fibonacci(7) + "; " + Fibonacci(12) + ".\n");

		System.out.println("#7 " + isValid("59001") + "; " + isValid("853a7") + "; " + isValid("732 32") + "; " + isValid("393939") + ".\n");
		
		System.out.println("#8 " + isStrangePair("ratio", "orator") + "; " + isStrangePair("sparkling", "groups") + "; " + isStrangePair("bush", "hubris") + "; " + isStrangePair("", "") + ".\n");
		
		System.out.println("#9 " + isPrefix("automation", "auto-") + "; " + isSuffix("arachnophobia", "-phobia") + "; " + isPrefix("retrospect", "sub-") + "; " + isSuffix("vocation", "-logy") + ".\n");
		
		System.out.println("#10 " + boxSeq(0) + "; " + boxSeq(1) + "; " + boxSeq(2) + ".\n");
		
	}
	//#1
	private static String repeat(String str, int b) {
		String str1 = new String();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			for (int j = 0; j < b; j++) {
				str1=str1+c;
			}
		}
		return str1;
	}
	//#2
	private static int differenceMaxMin(int[] a) {
		int min = a[0];
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max - min;
	}
	//#3
	private static boolean isAvgWhole(int[] a) {
		double s = 0;
		for (int i = 0; i < a.length; i++) {
			s = s + a[i];
		}
		if ((s/a.length) == (int)(s/a.length))
			return true;
		else
			return false;
	}
	//#4
	// IntArr_ToStr - метод для перевода массива целых чисел в строку вида [a0, ..., an]
	private static String IntArr_ToStr(int[] a) {
		a = cumulativeSum(a);
		String str = new String();
		str = "[" + a[0];
		for (int i = 1; i < a.length; i++) {
			str = str + ", " + a[i];
		}
		str = str + "]";
		return str;
	}
	/* cumulativeSum - метод, который берет массив целых чисел и возвращает массив, в
	котором каждое целое число является суммой самого себя + всех предыдущих
	чисел в массиве.*/
	private static int[] cumulativeSum(int[] a) {
		for (int i = (a.length - 1); i > 0; i--) {
			for (int j = 0; j < i; j++) {
				a[i]+=a[j];
			}	
		}
		return a;
	}
	//#5
	private static int getDecimalPlaces(String str) {
		int dot = str.indexOf('.');
		if (dot == -1)
			return 0;
		else
			return str.length() - (str.indexOf('.') + 1);
	}
	//#6
	private static int Fibonacci (int a) {
		int b = 0;
		int c = 1;
		int d = 0;
		for (int i = 0; i < a; i++) {
			d = b + c;
			b = c;
			c = d;
		}
		return d;
	}
	//#7
	private static boolean isValid (String str) {
		if (str.length() != 5) 
			return false;
		for (int i = 0; i < 5; i++) {
			if ((str.charAt(i) < '0') || (str.charAt(i) > '9'))
				return false;					
		}
		return true;
	}
	//#8
	private static boolean isStrangePair(String str1, String str2) {
		if ((str1 == str2) || ((str1.charAt(0) == str2.charAt(str2.length() - 1)) & (str1.charAt(str1.length() - 1) == str2.charAt(0))))
			return true;
		else
			return false;
	}
	//#9
	private static boolean isPrefix(String word, String prefix) {
		return word.regionMatches(0, prefix, 0, (prefix.length() - 1));
	}
	private static boolean isSuffix(String word, String suffix) {
		return word.regionMatches(((word.length() - 1) - (suffix.length() - 2)), suffix, 1, (suffix.length() - 1));
	}
	//#10
	private static int boxSeq(int a) {
		return (3 * ((a / 2) + (a % 2)) - (a / 2));
	}
}