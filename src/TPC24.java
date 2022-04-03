import kr.tpc.*;

public class TPC24 {
	public static void main(String[] args) {
		// 2. 다형성 배열 -> 배열임에도 다른 타입을 저장 할 수 있다.
		// Dog, Cat 저장할 배열을 생성해보자.
		Animal[] ani = new Animal[2];
		ani[0] = new Dog();
		ani[1] = new Cat();
		
		display(ani); 
		
	}
	
	public static void display(Animal[] ani){	// 다형성 배
		for(int i = 0; i < ani.length; i++) {
			ani[i].eat();
			if(ani[i] instanceof Cat) {
			((Cat)ani[i]).night();
			}
		}
	}
}
