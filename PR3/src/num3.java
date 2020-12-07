public class num3{
	public static void main(String[] args) { 
		System.out.println("#1 " + solutions(1, 0, -1) + "; " + solutions(1, 0, 0) + "; " + solutions(1, 0, 1) + ".\n");
		
		System.out.println("#2 " + findZip("all zip files are zipped") + "; " + findZip("all zip files are compressed") + ".\n");
		
		System.out.println("#3 " + checkPerfect(6) + "; " + checkPerfect(28) + "; " + checkPerfect(496) + "; " + checkPerfect(12) + "; " + checkPerfect(97) + ".\n");
		
		System.out.println("#4 " + flipEndChars("Cat, dog, and mouse.") + "\n   " + flipEndChars("ada") + "\n   " + flipEndChars("Ada") + "\n   " + flipEndChars("z") + "\n");
		
		System.out.println("#5 " + isValidHexCode("#CD5C5C") + "; " + isValidHexCode("#EAECEE") + "; " + isValidHexCode("#eaecee") + "; " + isValidHexCode("#CD5C58C") + "; " + isValidHexCode("#CD5C5Z") + "; " + isValidHexCode("#CD5C&C") + "; " + isValidHexCode("CD5C5C") + ".\n");
		
		int [] arr6_1_1= {1, 3, 4, 4, 4};
		int [] arr6_2_1= {9, 8, 7, 6};
		int [] arr6_3_1= {2};
		int [] arr6_1_2= {2, 5, 7};
		int [] arr6_2_2= {4, 4, 3, 1};
		int [] arr6_3_2= {3, 3, 3, 3, 3};
		System.out.println("#6 " + same(arr6_1_1, arr6_1_2) + "; " + same(arr6_2_1, arr6_2_2) + "; " + same(arr6_3_1, arr6_3_2) + ".\n");

		System.out.println("#7 " + isKaprekar(3) + "; " + isKaprekar(5) + "; " + isKaprekar(297) + ".\n");
		
		System.out.println("#8 " + longestZero("01100001011000") + "; " + longestZero("100100100") + "; " + longestZero("11111") + ".\n");
		
		System.out.println("#9 " + nextPrime(12) + "; " + nextPrime(24) + "; " + nextPrime(11) + ".\n");
		
		System.out.println("#10 " + rightTriangle(3, 4, 5) + "; " + rightTriangle(145, 105, 100) + "; " + rightTriangle(70, 130, 110) + ".\n");
		
	}
	//#1
	private static int solutions(int a, int b, int c) {
		if ((b*b - 4 * a * c) > 0)
			return 2;
		if ((b*b - 4 * a * c) == 0)
			return 1;
		return 0;
	}
	//#2
	private static int findZip(String str) {
		/*int indexOf(String str, int fromIndex) 
		 * — возвращает индекс в данной строке первого вхождения 
		 * указанной подстроки, начиная с указанного индекса. 
		 * Если не встречается, возвращается -1.
		 */
		int zip = 0;
		int i = 0;
		while ((str.indexOf("zip", i) != -1) & (i < str.length())) {
			i = str.indexOf("zip", i) + 1;
			zip+=1;
		}
		if (zip > 1)
			return i - 1;
		return -1;
	}
	//#3
	private static boolean checkPerfect(int a) {
		int num = 1;
		int s = 0;
		while (num < a) {
			if (a % num == 0)
				s = s + num;
			num+=1;
		}
		if (s==a)
			return true;
		else
			return false;
	}
	//#4
	// IntArr_ToStr - метод для перевода массива целых чисел в строку вида [a0, ..., an]
	private static String flipEndChars(String str) {
		if (str.length() < 3)
			return "Incompatible.";
		if (str.charAt(0) == str.charAt(str.length() - 1))
			return "Two's a pair.";		
		return str.charAt((str.length() - 1)) + str.substring(1, (str.length() - 1)) + str.charAt(0);
	}
	//#5
	private static boolean isValidHexCode(String str) {
		if ((str.length() != 7) || (str.charAt(0) != '#'))
			return false;
		int i = 1;
		while (i < 7) {
			if	((((str.charAt(i) < '0') || (str.charAt(i) > '9'))
				& ((str.charAt(i) < 'a') || (str.charAt(i) > 'f')))
				& ((str.charAt(i) < 'A') || (str.charAt(i) > 'F')))
					return false;
			i++;
		}
		return true;
	}
	//#6
	// метод sum_num_arr считает количество уникальных цифр в массиве
	private static int sum_num_arr (int a[]) {
		int sum = 1;
		int u;
		for (int i = 1; i < a.length; i++) {
			u = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (a[j] == a[i])
					u = 0;
			}
			if (u == 1)
				sum+=1;
		}
		return sum;
	}
	// метод same сравнивает результаты обработки массивов a и b методом sum_num_arr
	private static boolean same (int a[], int b[]) {
		if (sum_num_arr (a) == sum_num_arr (b))
				return true;
		return false;
	}
	//#7
	private static boolean isKaprekar (int a) {
		a = Math.abs(a);
		int s = a * a;
		String str = new String();
		str = str + s;
		int sum = 0;
		if (str.length() % 2 != 0)
			sum = (int) (s / (Math.pow(10, (str.length() / 2 + 1)))) + (int) (s % (Math.pow(10, (str.length() / 2 + 1))));
		else
			sum = (int) (s / (Math.pow(10, (str.length() / 2)))) + (int) (s % (Math.pow(10, (str.length() / 2))));
		if (sum == a)
			return true;
		return false;
	}
	//#8
	private static String longestZero(String str) {
		String zero = new String();
		while (str.indexOf(zero + "0") != -1) {
			zero+='0';
		}
		return zero;
	}
	//#9
	private static int nextPrime(int a) {
		int b = 2;
		int prime = 0;
		while (b < a & prime == 0) {
			if (a % b == 0)
				prime = 1;
			b++;
		}
		while (b != a) {
			prime = 0;
			b = 2;
			a += 1;
			while (b < a & prime == 0) {
				if (a % b == 0)
					prime = 1;
				b++;
			}
		}
		return b;
	}
	//#10
	private static boolean rightTriangle(int a, int b, int c) {
		if	(a * a == (b * b + c * c) || 
			(b * b == (a * a + c * c) || 
			(c * c == (b * b + a * a))))
			return true;
		return false;
	}
}