
public class TPC35 {
	public static void main(String[] args) {

		String str1 = new String("apple");
		String str2 = new String("apple");

		if (str1 == str2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		// 위가 노가 나오는 이유 -> 안에 값만 같을 뿐이지 str1, str2각 번지가 다르기 때문(str1과 str2를 비교)
		// 그렇다면 값이 같은지 확인하려면?
		if (str1.equals(str2)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		System.out.println();//------------------------------------------------------
		
		String str4 = "apple";
		String str5 = "apple";
		if(str4 == str5) {
			System.out.println("Same");
		}else {
			System.out.println("Not Same");
		}
		
	}
}
