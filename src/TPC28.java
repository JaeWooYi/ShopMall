import kr.poly.noMean;

public class TPC28 {
	public static void main(String[] args) {

		noMean nm = new noMean();
		nm.display();
		System.out.println(nm.toString());
		System.out.println(nm);	// 위랑 같지 -> toString이 기본적으로 생략되있는거야
								// !! noMean가서 toString재정의 한거 없애봐 -> 번지가 나올거야 : 왜냐? Object클래스의 toString이 나올거니까
		
		
		System.out.println();
		
		Object obj = new noMean();	// 객체 이렇게 만들어도 되. 내가 처음에 이렇게 하려고 했지
									// UpCasting으로 만든거지
//		obj.display();	왜안뜰까? 다운캐스팅 해야해서그래
		((noMean)obj).display();
		System.out.println(obj);
	}
}
