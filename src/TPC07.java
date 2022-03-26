
public class TPC07 {
	public static void main(String[] args) {
		// 1.
		int a = 20;
		float b = 56.7f;

		float result = sum(a, b); // Call by value : 값 전달기법
		System.out.println(result);

		System.out.println();
		System.out.println("-----");
		System.out.println();

		// 2.
		int[] arr = { 1, 2, 3, 4, 5 };
		// 배열의 총합을 구해보자
		int hapResult = sumArr(arr);	// Call by reference : 번지 전달기법 
		System.out.println(hapResult);

	}

	// 1.
	public static float sum(int a, float b) {
		float hap = a + b;
		return hap;
	}

	// 2.
	public static int sumArr(int[] anything) {
		int kkk = 0;
		for (int i = 0; i < anything.length; i++) {
			kkk += anything[i];
		}
		return kkk;
	}

}
