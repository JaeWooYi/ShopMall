package kr.poly;

// interface는 메서드가 결여 되어 있기 때문에 객체를 생성 할 수 없다.
public interface Remocon {
	// 추상 메서드의 형태기 때문에(인터페이스는) 바디를({}) 만들 수 없다.
	public abstract void chUp();	// void 앞에 abstract가 생략 되어 있는거임.

	public void chDown();

	public void internet();
	
	// 상수 선언 가능
	int MAX_Channel = 100;	// 상수임 -> public static final이 생략 되어 있다.
	int MIN_Channel = 1;	// 물론 public final static 이라고 써도 된다.
	
}
