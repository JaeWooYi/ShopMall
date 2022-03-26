package ReviewAndPractice;

public class p001_2 {
	
	public static void main(String[] args) {
		
		int d = justSum(100,200);
		System.out.println(d);
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		int[] summary = arrSum();
		int hap = 0;
		for(int i = 0; i < summary.length; i++) {
			hap += summary[i];
		}
		System.out.println(hap);
		
	}
	// 1.
	public static int justSum(int a, int b) {
		int c = a + b;
		return c;
	}
	
	// 2.
	public static int[] arrSum() {
		int[] arrEx = new int[5];
		arrEx[0] = 1;
		arrEx[1] = 3;
		arrEx[2] = 5;
		arrEx[3] = 7;
		arrEx[4] = 9;
		
		return arrEx;
	}

}
