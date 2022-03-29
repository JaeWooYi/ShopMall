import kr.tpc.MovieVO;

public class TPC17 {
	public static void main(String[] args) {
		
		int[] a = new int[]{10, 20, 30, 40, 50};
		for(int i = 0; i < a.length; i ++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		MovieVO movieVo = new MovieVO("MyStrory", "11000won", "YJW", 19, "200minutes");
		System.out.println(movieVo.toString());
		
		MovieVO[] movieVoArr = new MovieVO[3];
		movieVoArr[0] = new MovieVO("MyStrory2", "12000won", "YJW", 19, "201minutes");
		movieVoArr[1] = new MovieVO("MyStrory3", "13000won", "YJW", 19, "202minutes");
		movieVoArr[2] = new MovieVO("MyStrory4", "14000won", "YJW", 19, "203minutes");
		System.out.println("---------------------------");
		System.out.println(movieVoArr[0]);	// toString 생략 가능 
		System.out.println(movieVoArr[1]);
		System.out.println(movieVoArr[2]);
		System.out.println("---------------------------");
		
		for(int i = 0; i < movieVoArr.length; i++) {
			System.out.println(movieVoArr[i].toString());
		}
	}
}
