package kr.tpc;

public class Animal {
	// Dog와 Cat의 공통 기능 eat()
	public void eat() {
		System.out.println("?");
	}
	
	// 생략 되어있음.
	public Animal() {
		super();	// 얘는 Object를 상속받아져있어.(최상위 클래스)
	}
}
