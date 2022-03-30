import com.google.gson.Gson;

import kr.tpc.MyUtil;
import kr.tpcBook.BookVo;

public class TPC18 {
	
	public static void main(String[] args) {
		// 1. Java에서 제공해주는 class들.. API
		// 문자열 : String
		String str = new String("APPLE");
		System.out.println(str.toLowerCase());	// 소문자로 바꿔서 출력 
		
		System.out.println();
		
		// 2. 직접 만들어서 사용하는 class들.. DTO/VO, DAO, Utility.... API
		// kr.tpc에 MyUtil만듬
		MyUtil myUtil = new MyUtil();
		myUtil.hap();
		
		System.out.println();
		
		// 3. 다른회사에서 만들어놓은 클래스들... API
		// ex) Gson -> json
		// 다운완료 : Referenced Libraries!
		Gson gson = new Gson();
		BookVo bookVo = new BookVo("kkk", "10000won", "Jcompany", "100p");
		String json = gson.toJson(bookVo);
		System.out.println(json);
	}

}
