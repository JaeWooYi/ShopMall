import kr.tpcBook.Book;

public class TPC10 {
	public static void main(String[] args) {

		// 기본자료형 vs 사용자정의 자료형 
		int a = 10; // 기본자료형

		
		
		//		Book b = 책제목;	// 이런자료형은 없어 한번 우리가 만들어보자 
						// kr.tpc10 패지에 만들어놨어 임포트해서 가져와보자
		//		Book b;
		//		b = new Book();
		Book book = new Book(); 	// 위 두줄을 이렇게 한줄로 표현하는게 편하겠지?
		book.title = "나의 이야기";
		book.price = "100000";
		book.publisher = "재우출판";
		book.page = "10000page";
		System.out.println(book.title);		
		System.out.println(book.price);		
		System.out.println(book.publisher);		
		System.out.println(book.page);		
	}
}
