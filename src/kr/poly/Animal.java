package kr.poly;

public abstract class Animal {		// 추상클래스(불완전한 객체)	-> Animal ani = new Animal(); 이 불가능
	// Dog와 Cat의 공통 기능 eat()
	public abstract void eat();		// 추상메서드(불완전한 메서드)
	
	public void move() {		// 구현 메서드도 넣을수 있다.
		System.out.println("무리지어 이동한다.");
	}
}
