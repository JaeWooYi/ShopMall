import kr.tpc.A;
import kr.tpc.B;

public class TPC29 {
	public static void main(String[] args) {

		A a = new A();
		display(a);
		B b = new B();
		display(b);

	}

//	private static void display(A a) {
//		// TODO Auto-generated method stub
//		
//	}

//	private static void display(B b) {
//		// TODO Auto-generated method stub
//		
//	}
	
	// 원래는 위에처럼 2개 만들었지만 Object를 통해 하나로 쓸 수 있다.
	private static void display(Object o) {	//	다형성 인수 

		// 2. 언제는 A로 하고 언제는 B로 하고(if문을 쓰자)
		if (o instanceof A) {
			// 1. 다운캐스팅 먼저 : 쓸때는
			((A) o).go();
		} else {
			((B) o).go();
		}
	}

}
