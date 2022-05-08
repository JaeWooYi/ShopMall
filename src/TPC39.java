
public class TPC39 {
	public static void main(String[] args) {
		
		// 인트형 만드는법 2가지.
		int a = 1;
		Integer b = new Integer(2);
		Integer c = 3;	// Boxing기법 
  // Integer 타입 != 인트타입 -> 타입이 다르지만 컴파일러가 해
		System.out.println(b.toString());
		System.out.println(b.intValue());
		
		System.out.println();
		
		Object[] obj = new Object[3];
		obj[0] = new Integer(1);	// 원래는 이게 정석이야 
		obj[1] = 2;		// 근데 이게 편하지 
		obj[2] = 3;
		System.out.println(obj[0].toString());
		System.out.println(obj[1].toString());
		System.out.println(obj[2]);	// toString()생략된거야
		
		System.out.println();
		
		// "100" + "100" = 200을 만들어 보자
		String num1 = "100";
		String num2 = "100";
		int numEx1 = Integer.parseInt(num1);
		int numEx2 = Integer.parseInt(num2);
		System.out.println(numEx1 + numEx2);
		// 원래는 이거
		System.out.println(num1 + num2);
		// 그렇다면 100 + 100 = 100100으로하려면? valueOf를 쓰면 된다.
		String s1 = String.valueOf(numEx1);
		String s2 = String.valueOf(numEx2);
		System.out.println(s1 + s2);
		
	}
}
