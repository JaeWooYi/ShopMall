import kr.tpcBook.BookVo;

public class TPC12 {
	public static void main(String[] args) {
		// 생성자 -> 생성 + 초기화 : 메서드를 중복정의 할 수 있다.
		
		// 초기값만 나오지?
		BookVo bookVo = new BookVo();
		System.out.print(bookVo.title + "\t");
		System.out.print(bookVo.price + "\t");
		System.out.print(bookVo.publisher + "\t");
		System.out.print(bookVo.page + "\t");
		
		System.out.println();
		System.out.println();
		System.out.println("------------");
		System.out.println();
		
		BookVo bookVo2 = new BookVo();
		bookVo2.title = "randomBook";
		bookVo2.price = "1000won";
		bookVo2.publisher = "BadCompany";
		bookVo2.page = "200p";
		System.out.print(bookVo2.title + "\t");
		System.out.print(bookVo2.price + "\t");
		System.out.print(bookVo2.publisher + "\t");
		System.out.print(bookVo2.page + "\t");
		
		System.out.println();
		System.out.println();
		System.out.println("------------");
		System.out.println();
		
		// 딱 밑에 꺼만 있으면 에러가나 왜냐면 새로운 생성자를 만들어야 해서 
		// BookVo 가봐 -> 오버로딩 되어있
		BookVo bookVo3 = new BookVo("WhatBook", "9900", "WhatCompany", "600p" );
		System.out.print(bookVo3.title + "\t");
		System.out.print(bookVo3.price + "\t");
		System.out.print(bookVo3.publisher + "\t");
		System.out.print(bookVo3.page + "\t");
		
	}
}
