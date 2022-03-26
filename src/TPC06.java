//
public class TPC06 {
	public static void main(String[] args) { 
		// 5. 메서드 -> 동작(method), 기능(function)
		// 메서드는 독립적으로 만들어야하기 때문에 메인 바깥
		int i = 53;
		int k = 99;
		int summary = sum(i, k);
		System.out.println(summary);

		System.out.println("-------------");

		int[] sumArr = makeArr();
		int HapArr = 0;
		for(int j = 0; j < sumArr.length; j++) {
			HapArr += sumArr[j];
		}
		System.out.println(HapArr);
	}

	// 정수 2개르 매개변수로 받아서 총합을 구하여 리턴하는 메서드를 정의해보자!
	// void는 return이 없을때 -> 리턴하지 않겠다.
	public static int sum(int a, int b) { // 호출하려면 static을 붙여줘야 : main메서드도 static이자(같은 static일때 호출 가)
		int v = a + b;
		return v;
	}

	// 이번엔 배열로 여러개를 처리해볼까
	public static int[] makeArr() {
		int[] arr = new int[3];
		int x, y, z;
		x = 1;
		y = 3;
		z = 5;
		arr[0] = x;
		arr[1] = y;
		arr[2] = z;
		return arr;
	}

}
