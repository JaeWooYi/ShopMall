import kr.tpcBook.BookVo;

public class TPC11 {
	public static void main(String[] args) {
		// 책 1권을 저장하기 위해 [객체를 생성]해보자.
		BookVo bookVo = new BookVo();
		bookVo.title = "JustBook";
		bookVo.price = "10000won";
		bookVo.publisher = "jwCompany";
		bookVo.page = "100page";
		
		System.out.println(bookVo.title);
		System.out.println(bookVo.price);
		System.out.println(bookVo.publisher);
		System.out.println(bookVo.page);
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		BookVo bookVo2 = new BookVo();
		bookVo2.title = "JustBook2";
		bookVo2.price = "20000won";
		bookVo2.publisher = "jwCompany";
		bookVo2.page = "1000page";
		
		System.out.println(bookVo2.title);
		System.out.println(bookVo2.price);
		System.out.println(bookVo2.publisher);
		System.out.println(bookVo2.page);
	}
}
