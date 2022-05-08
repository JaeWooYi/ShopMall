import java.util.*;

import kr.tpcBook.BookDTO;

public class TPC38 {
	public static void main(String[] args) {
		
		List<BookDTO> list = new ArrayList<BookDTO>(1);
		list.add(new BookDTO("Java Book", "12000won", "just Acompony", "100p"));
		list.add(new BookDTO("Python Book", "13000won", "just Bcompony", "200p"));
		list.add(new BookDTO("C++ Book", "14000won", "just Ccompony", "300p"));
		
		for(int i = 0; i < list.size(); i++) {
//			Object o = list.get(i);
//			BookDTO vo = (BookDTO)o;
			BookDTO vo = (BookDTO)list.get(i);
			System.out.println(vo.title+ "\t" + vo.price + "\t" + vo.company + "\t" + vo.page);
		}
		
	}
}
