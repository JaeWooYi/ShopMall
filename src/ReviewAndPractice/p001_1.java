package ReviewAndPractice;

// !!!!!!!!!! 정수3 개를 더하는 메서를 만들어보자(배열로)

public class p001_1 {

	public static void main(String[] args) {
		
		// 1-5. 배열 선언해서 메서드 넣기 
		int[] hap = arrOne();
		
		// 1-6. 합이 될 변수의 초기값 설정
		int summary = 0;
		
		// 1-7. 반복문을 통해 배열안의 값들을 더해보자.		
		for(int i = 0; i < hap.length; i++) {
			summary += hap[i];
		}
		
		// 1-8. 이제 더한값을 출력을 해보자!
		System.out.println(summary);
		
	}
	
	// 1. 메서드 부터 만들어볼까
	public static int[] arrOne() {
		// 1-1. 배열 선언 해주기
		int[] arrTwo = new int[3];
		
		// 1-2. 선언된 배열안에 넣을 값을 또 선언 
		int x = 10;
		int y = 20;
		int z = 30;
		
		// 1-3. 각 배열의 위치에 위에서 선언된 인트값을 넣기 
		arrTwo[0] = x;
		arrTwo[1] = y;
		arrTwo[2] = z;
		
		// 1-4. 선언된 배열을 반환 시키기 
		return arrTwo;
	}
}
