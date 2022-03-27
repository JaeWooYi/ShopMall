import kr.tpc.Inflearn;

public class TPC31 {
	public static void main(String[] args) {
		Inflearn inflearn = new Inflearn();
		inflearn.tpc();
		inflearn.java();	// 틀린건아닌데 접근방법이 조금 그렇다 -> 그래서 노란줄 뜨는거야. 밑에처럼 써야해.
		Inflearn.java();
		
		// Java API 중에서 private인 친구들 예 
//		System sys = new System();
//		System. 누르고 바로 쓰자나.
//		Math.  
		// Math 뭔지 함 보자 
		int vvv = Math.max(10, 20);	// 최대값이로군 
		System.out.println(vvv);
	}
}
