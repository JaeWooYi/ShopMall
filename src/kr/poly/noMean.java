package kr.poly;

public class noMean extends java.lang.Object{		// 1. 아무것도 안보이지만 extends Object가 생략 되있는거 -> 기본적으로 클래스 만들때

	// 2. 디폴트 생성자도
	public noMean () {
		super();
	}
	
	public void display() {
		System.out.println("I'm noMean");
	}

	
	// toString() 을 재정의 해보자 -> 원래 Object안에 있는 메서드야
	@Override
	public String toString() {
		return "I'm Override Method";
	}
}
