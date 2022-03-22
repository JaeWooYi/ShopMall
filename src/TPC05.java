public class TPC05 {
	public static void main(String[] args) {
		// 1.----------
		int[] ExArr = new int[]{1,3,5};
		int sum = 0;
		for(int i = 0; i < ExArr.length; i++) {
			sum += ExArr[i];
		}
		System.out.println(sum);
		//----------
		
		System.out.println();
		
		// 2.---------- 9개의 정수형 변수를 만들어라 -> 2차원구조로
		int[][] ExArr2 = new int[3][3];
//		System.out.println(ExArr2.length);
//		System.out.println();
		ExArr2[0][0] = 1;
		ExArr2[0][1] = 2;
		ExArr2[0][2] = 3;
		
		ExArr2[1][0] = 1;
		ExArr2[1][1] = 2;
		ExArr2[1][2] = 3;
		
		ExArr2[2][0] = 1;
		ExArr2[2][1] = 2;
		ExArr2[2][2] = 3;
		// for로 표현한다면
		for(int i = 0; i < ExArr2.length; i++) {
			for(int j = 0; j < ExArr2[i].length; j++) {
				System.out.print(ExArr2[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 3.---------- 가변길이 배열
		int[][] star = new int[5][];
		star[0] = new int[1];
		star[1] = new int[2];
		star[2] = new int[3];
		star[3] = new int[4];
		star[4] = new int[5];
		
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				star[i][j] = '*';
				System.out.print((char)star[i][j]);
			}
			System.out.println();
		}
	}

}