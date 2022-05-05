
public class TPC34 {
	public static void main(String[] args) {
		// String
		java.lang.String str = new java.lang.String("APPLE");	// java.lang 생략되있는거야 -> 임포트 역시
		String v = str.toLowerCase();
		System.out.println(v);
		System.out.println(str.charAt(4));
		System.out.println(str.length());
		System.out.println(str.indexOf("PL"));
		System.out.println(str.indexOf("PS"));	// -1 : 없다는 뜻
		System.out.println(str.replace("E", "e"));
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
