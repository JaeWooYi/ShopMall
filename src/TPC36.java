import kr.inflearn.IntArray;

public class TPC36 {
	public static void main(String[] args) {
		// 정수 3개를 배열에 저장하고 출력 하시오.
		int[] kkk = {1,2,3};
		for(int i = 0; i < kkk.length; i++) {
			System.out.println(kkk[i]);
		}
		
		// 위 배열기능을 API로 만들어 볼까?
		System.out.println();
		//---------------------------------------------------
		
		IntArray arr = new IntArray(5);	// 아무 입력 없으면 디폴트로 10size다(this(10))
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
