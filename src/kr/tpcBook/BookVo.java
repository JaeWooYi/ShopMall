package kr.tpcBook;

public class BookVo {
	public String title;
	public String price;
	public String publisher;
	public String page;
	
	// 디폴트 생성자가 생략 되어있음.
	// 만들어보자(디폴트생성자)
	public BookVo() {
		// 초기화 작업
		this.title = "JustBook";
		this.price = "10000won";
		this.publisher = "GoodCompany";
		this.page = "100p";	
		// 맨 위 this. 생략해도 되지만 해라.
	}
	
	
	// 내가 이렇게 만들면 디폴트 생성자가 자동으로 안만들어져, 그러니까 위에꺼 없다는 뜻이지.
	// 생성자 메서드의 중복정의(오버로딩 : overloading)
	public BookVo(String title, String price, String publisher, String page) {
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.page = page;	
	}
}
