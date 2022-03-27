package kr.tpc;

public class Inflearn {
	// 인스턴스 메서드(no static)
	// 객체를 만들어야만 쓸수있다.
	public void tpc() {
		System.out.println("TPC강의 너무 재미있다.");
	}
	
	// 클래스 메서드(static)
	// 객체없이 클래스이름.메서드 형식으로 바로 사용 가능.
	// 물론 객체만들어서 해도 되긴 되는데 음... 정석은아닌가
	public static void java() {
		System.out.println("Java강의 너무 재미있다.");
	}
	

	// 생성자를 private로 하면 객체를 못만들어.
	//private Inflearn() {}
}
