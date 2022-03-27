package kr.tpcBook;

public class BookDTO {
	public String title;
	public String price;
	public String company;
	public String page;
	
//	// 생략되있는 생성자를 직접 써보자 
//	public BookDTO() {
////		super();	// 이거조차도 생략되어있음.
//		// 객체를 생성하는 작업을한다 이 공간에서는 
//	}

	public BookDTO(String title, String price, String company, String page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
	
	 //
	
}
