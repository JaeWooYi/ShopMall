package kr.poly;

public class TV implements Remocon{

	// 만약 현재 채널이 70이다
	int currentCh = 70; 
	
	@Override
	public void chUp() {
		if(currentCh < Remocon.MAX_Channel) {
			currentCh++;
			System.out.println("Channel Up! : " + currentCh);
		}else {
			currentCh = 1;
			System.out.println("Channel Up! : " + currentCh);
		}
	}

	@Override
	public void chDown() {
		if(currentCh > Remocon.MIN_Channel) {
			currentCh--;
			System.out.println("Channel Down! : " + currentCh);
		}else {
			currentCh = 100;
			System.out.println("Channel Down! : " + currentCh);
		}
	}

	@Override
	public void internet() {
		System.out.println("Go Internet!");
	}

}
