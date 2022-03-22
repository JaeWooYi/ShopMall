import kr.bit.Book;

public class TPC03 {
	
	public static void main(String[] args) {
		// 관계를 이해하라. PDT(기본자료형) vs UDDT(사용자정의 자료형)

		// ex) 정수 1개를 저장하기 위한 변수를 선언하시오.
		int a = 10;
		
		// ex) 책 1권을 저장하기 위한 변수를 선언하시오.
		// 외부클래스 Book을 만들자!(설계) -> 내부로 해도 되
		// 요기 강사님은 외부 패키지로했넹.. 임포트할생각이군
		Book book = new Book();
		System.out.println("----- 책정보 -----");
		System.out.println("책 제목 : " + book.title);
		System.out.println("출판사 : " + book.company);
		System.out.println("가격 : " + book.price);
		System.out.println("페이지 수 : " + book.page);
		
		System.out.println();

		// ex) PersonVo -> 회원 : 이름, 나이, 몸무게, 키....
		// 난 내부 클래스로 할래!
		class PersonVo {
			String name = "YJW";
			String age = "30age";
			String weight = "83.0kg";
			String height = "169.6cm";
		}
		PersonVo personVo = new PersonVo();
		System.out.println("----- 나의정보 -----");
		System.out.println("Name : " + personVo.name);
		System.out.println("Age : " + personVo.age);
		System.out.println("Weight : " + personVo.weight);
		System.out.println("Height : " + personVo.height);
	}

}