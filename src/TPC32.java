import kr.tpc.DbConnect;
import kr.tpc.JavaMysql;
import kr.tpc.JavaOracle;

public class TPC32 {
	public static void main(String[] args) {
		// Oracle or Mysql등을 연결하려면 -> Driver Class를 연결해야 한다(흉내만 내는거임)
		DbConnect conn = new JavaOracle();
		conn.getConnection("ExUrl", "ExId", "ExPw");
		
		conn = new JavaMysql();
		conn.getConnection("ExUrl", "ExId", "ExPW");
	}
}
