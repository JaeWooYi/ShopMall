package kr.inflearn;

// public 안쓰면 default가 생략되 있는거다
public class MyClass {

	// a~b까지의 총합 구하는 함수 만들어봐
	public int sum(int a, int b) {
		int hap = 0;
		for(int i = a; i < b+1; i++){
			hap += i;	// hap = hap + i 
		}
		return hap;
	}
}
