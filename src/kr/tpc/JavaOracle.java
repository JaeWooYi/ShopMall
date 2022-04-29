package kr.tpc;

public class JavaOracle implements DbConnect{

			
	@Override	// 가정을 하는거야
	public void getConnection(String url, String user, String password) {
		System.out.println("Connected Oracle DB");
	}
	
}
