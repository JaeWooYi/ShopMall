import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {
	public static void main(String[] args) {
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		
		ani.move();
		
		System.out.println();
		
		((Cat)ani).night();  	// 고양이에게만 있는 night메서드도 다운캐스팅을 통해 나타 낼 수 있다.
		
	}
	
}

// !!! 추상클래스는 혼자서는 동작 할 수 없다(객체를 생성 할 수 없다.)
