import kr.tpcBook.BookDTO;

public class TPC13 {
	public static void main(String[] args) {
		// 책을 사용하기 위해 BookDTO를 설계했다 치자
		// 책 -> class(BookDTO) -> 객체 -> 인스턴스
		String title = "spring";
		String price = "20000won";
		String company = "SpringCompany";
		String page = "300p";
		// 위 자체는 책은아냐. 그냥 변수 자체일 뿐이지.

		// 그럼 어떻게 하나의 책으로 만들까 1. 배열 or 2. 직접설
		BookDTO bookDTO;	// 아무것도 안가리키고있음(객체 : Object)
		bookDTO = new BookDTO(title, price, company, page);	// 인스턴스화 -> 가르키는게 생긴거야(실체)
		
		bookPrint(bookDTO);

	}
	
	// 한번에 출력해보자 
	public static void bookPrint(BookDTO bookDTO) {
		System.out.print(bookDTO.title + "\t");
		System.out.print(bookDTO.price + "\t");
		System.out.print(bookDTO.company + "\t");
		System.out.print(bookDTO.page + "\t");
	}
}
