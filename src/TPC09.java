
public class TPC09 {
	public static void main(String[] args) {
		int aa = 17;
		int bb = 23;
		TPC09 tpc09 = new TPC09();	// sum 함수(method)가 static이 아니기 때문에 객체를 생성해야해.
									// 객체는 힙 메모리에 생성된다.
		int cc = tpc09.sum(aa, bb);
		System.out.println(cc);
	}

	public int sum(int a, int b) {	// not static
		int c = a + b;
		return c;
	}
	
}
