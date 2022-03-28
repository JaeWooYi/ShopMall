import kr.tpc.MemberVo;

public class TPC15 {
	
	public static void main(String[] args) {
		MemberVo memberVo = new MemberVo("HongGilDong", "500sal", "no phone", "Korea");
		
		System.out.println(memberVo.toString());
		System.out.println(memberVo);	// toString() 하나 안하나 결과는 똑같네.. 왤까? 바로 생략되었기 때문이지 
	}

}
