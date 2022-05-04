import kr.tpc.A;
import kr.tpc.B;

// 다형성 배열을 해보자 

public class TPC30 {
	public static void main(String[] args) {
		// A, B 클래스를 저장할 배열을 만들어봐라
		Object[] o = new Object[2];	// 다형성 배열
		o[0] = new A();
		o[1] = new B();
		
		for(int i = 0; i < o.length; i++) {
			if(o[i] instanceof A) {
				((A)o[i]).go();
			}else {
				((B)o[i]).go();
			}
		}
		
		System.out.println();
		printGo(o);
	}

	private static void printGo(Object[] o) {
		for(int i = 0; i < o.length; i++) {
			if(o[i] instanceof A) {
				((A)o[i]).go();
			}else {
				((B)o[i]).go();
			}
		}
	}
}
