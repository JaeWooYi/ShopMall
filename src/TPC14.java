import kr.tpc.MemberVo;

public class TPC14 {
	public static void main(String[] args) {
		MemberVo memberVo = new MemberVo();
		memberVo.setName("YJW");
		memberVo.setAge("100살");
		memberVo.setTel("010-0000-0000");
		memberVo.setAddr("Dockdo");
		
		System.out.println(memberVo.getName());
		System.out.println(memberVo.getAge());
		System.out.println(memberVo.getTel());
		System.out.println(memberVo.getAddr());
	}

}
