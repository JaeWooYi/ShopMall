import kr.inflearn.MyClass;

public class TPC33 {
	public static void main(String[] args) {
		
		// 여기서 kr.inflearn 패키지에 MyClass 클래스에 있는 함수 sum을 쓰고 싶어.
		MyClass myClass = new MyClass();
		int v = myClass.sum(1, 10);
		System.out.println(v);
	}
}
