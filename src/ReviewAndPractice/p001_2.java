package ReviewAndPractice;

public class p001_2 {
	
	public static void main(String[] args) {
		// 1. 
		int d = justSum(100,200);
		System.out.println(d);
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		// 2. 
		int[] summary = arrSum();
		int hap = 0;
		for(int i = 0; i < summary.length; i++) {
			hap += summary[i];
		}
		System.out.println(hap);
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		//3. 
		int[] kkk = new int[] {2,4,6,8,10};
		int result = sumThird(kkk);
		System.out.println(result);
		
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
	
	//3.
	public static int sumThird(int[] anything) {
		int hap2 = 0;
		for(int i = 0; i < anything.length; i++) {
			hap2 += anything[i];
		}
		return hap2;
	}

}
