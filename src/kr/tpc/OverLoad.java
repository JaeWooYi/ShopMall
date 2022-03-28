package kr.tpc;

public class OverLoad {
	// 동작(Method)으로만 이루어진 객체
//	public void hap() {
//		int a = 0;
//		int b = 0 ;
//		int c = a + b;
//		System.out.println(c);
//	}
	
	public void hap(int a, int b) {
		System.out.println(a + b);
	}
	
	public void hap(float a, int b) {
		System.out.println(a + b);
	}
	
	public void hap(float a, float b) {
		System.out.println(a + b);
	}
}
