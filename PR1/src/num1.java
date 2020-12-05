public class num1{
	public static void main(String[] args) { 
		System.out.println("#1 " + remainder(1, 3) + "; " + remainder(3, 4) + "; " + remainder(-9, 45) + "; " + remainder(5, 5) + ".\n");
		
		System.out.println("#2 " + triArea(3, 2) + "; " + triArea(7, 4) + "; " + triArea(10, 10) + ".\n");
		
		System.out.println("#3 " + animals(2, 3, 5) + "; " + animals(1, 2, 3) + "; " + animals(5, 2, 8) + ".\n");
		
		System.out.println("#4 " + profitableGamble(0.2, 50, 9) + "; " + profitableGamble(0.9, 1, 2) + "; " + profitableGamble(0.9, 3, 2) + ".\n");
		
		System.out.println("#5 " + operation(24, 15, 9) + "; " + operation(24, 26, 2) + "; " + operation(15, 11, 11) + ".\n");
		
		System.out.println("#6 " + ctoa('A') + "; " + ctoa('m') + "; " + ctoa('[') + "; " + ctoa('\\') + ".\n");
		
		System.out.println("#7 " + addUpTo(3) + "; " + addUpTo(10) + "; " + addUpTo(7) + ".\n");
		
		System.out.println("#8 " + nextEdge(8, 10) + "; " + nextEdge(5, 7) + "; " + nextEdge(9, 2) + ".\n");
		
		int [] arr= {1, 5, 9};
		int [] arr1={3, 4, 5}; 
		int [] arr2={2}; 
		int [] arr3={}; 
		System.out.println("#9 " + sumOfCubes(arr) + "; " + sumOfCubes(arr1) + "; " + sumOfCubes(arr2) + "; " + sumOfCubes(arr3) + ".\n");
		
		System.out.println("#10 " + abcmath(42, 5, 10) + "; " + abcmath(5, 2, 1) + "; " + abcmath(1, 2, 3) + ".\n");
		
	}
	//#1
	private static int remainder(int a, int b) {
		return a%b;
	}
	//#2
	private static float triArea(int a, int b) {
		return a*b/2;
	}
	//#3
	private static int animals(int a, int b, int c) {
		return 2*a+4*(b+c);
	}
	//#4
	private static boolean profitableGamble(double prob, int prize, int pay) {
		if (prob * prize > pay)
			return true;
		else
			return false;
	}
	//#5
	private static String operation(int N, int a, int b) {
		if (a+b==N)
			return "added";
		else if ((a-b==N)||(b-a==N))
				return "subtracted";
			 else if (a*b==N)
				 	return "added";
			 	  else if ((a/b==N)||(b/a==N))
			 		  	 return "subtracted";
			 	  	   else
			 	  		   	return "none";
	}
	//#6
	private static int ctoa(char a) {
		return a;
	}
	//#7
	private static int addUpTo(int a) {
		int s;
		s = 0;
		while (a>0) {
			s=s+a;
			a=a-1;
		}
		return s;
	}
	//#8
	private static int nextEdge(int a, int b) {
		return a+b-1;
	}
	//#9
	private static int sumOfCubes(int[] a) {
		int s;
		int i;
		s=0;
		i=0;
		while (i<a.length) {
			s=s+a[i]*a[i]*a[i];
			i++;
		}
		return s;
	}
	//#10
	private static boolean abcmath(int a, int b, int c) {
		int s;
		s=a;
		while (b>0) {
			s=s+a;
			a=s;
			b=b-1;
		}
		if (s%c==0)
			return true;
		else
			return false;
	}
}