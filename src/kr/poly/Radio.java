package kr.poly;

public class Radio implements Remocon{

	@Override
	public void chUp() {
		System.out.println("Radio Channel Up!");
	}

	@Override
	public void chDown() {
		System.out.println("Radio Channel Down!");
	}

	@Override
	public void internet() {
		System.out.println("No Internet Support..");
	}

}
