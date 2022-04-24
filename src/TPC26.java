import kr.poly.Radio;
import kr.poly.TV;

public class TPC26 {
	public static void main(String[] args) {
		
		// Remocon은 인터페이스 이기 때문에 객체를 만들 수 없음. 고로 아래처럼 구현을 받아서 사용 해야 한다.
		TV tv = new TV();
		tv.chUp();
		tv.chDown();
		tv.internet();
		
		System.out.println();
		
		Radio radio = new Radio();
		radio.chUp();
		radio.chDown();
		radio.internet();
		
	}
}
