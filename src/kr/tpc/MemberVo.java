package kr.tpc;

public class MemberVo {
	private String name;
	private String age;
	private String tel;
	private String addr;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getAddr() {
		return addr;
	}



	public void setAddr(String addr) {
		this.addr = addr;
	}

	// 디폴트 생성자 -> 이건 그냥 언제나 있는게 좋대. 사용하든 안하
	public MemberVo() {
		
	}

	public MemberVo(String name, String age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "MemberVo [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}

	
}
