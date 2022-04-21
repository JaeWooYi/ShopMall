package kr.poly;

public class Dog extends Animal{
	// 이름, 나이, 종 : 객체의 상태 정보
	// 기능 : 먹다
	@Override
	public void eat() {
		System.out.println("멍멍이 먹는다.");
	}
	
	// 생성자 생략 되어있음.
	public Dog() {
		super();	// new Animal();을 내부적으로 호출한 것과 비슷
	}
}
