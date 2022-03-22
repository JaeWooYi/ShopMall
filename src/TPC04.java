public class TPC04 {
	public static void main(String[] agrs) {
		// 4. 데이터를 이동해라(변수vs배열)
		int a, b, c;
		a=10;
		b=20;
		c=30;
		
		// a+b+c=? -> 메서드로 처리해라 : hap()
		hap(a,b,c);
		
		System.out.println();
		
		// 5. 배열로하면 더 편할거같아
		int[] intArrayEx = new int[3];
		intArrayEx[0] = a;
		intArrayEx[1] = b;
		intArrayEx[2] = c;
		
		hap2(intArrayEx);
	}
	
	// 4-1. 메서드 만들기
	public static void hap(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println(sum);
	}
	
	// 5-1. 메서드 만들기
	public static void hap2(int[] kkk) {
		
//		int sum2 = kkk[0] + kkk[1] + kkk[2];
//		System.out.println(sum2);
		
		// 반복문 활용해볼까?
		int sum2 = 0;
		for(int i = 0; i < kkk.length; i++) {
			sum2 += kkk[i];
		}
		System.out.println(sum2);
	}
}