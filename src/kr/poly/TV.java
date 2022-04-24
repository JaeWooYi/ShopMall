package kr.poly;

public class TV implements Remocon{

	@Override
	public void chUp() {
		System.out.println("Channel Up!");
	}

	@Override
	public void chDown() {
		System.out.println("Channel Down!");
	}

	@Override
	public void internet() {
		System.out.println("Go Internet!");
	}

}
