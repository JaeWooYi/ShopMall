package kr.tpc;

public class JavaMysql implements DbConnect{

	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("Connected Mysql DB");
	}

}
