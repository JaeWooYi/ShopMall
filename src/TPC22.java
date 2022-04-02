import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {
	
	public static void main(String[] args) {
		
		// UpCasting
//		Cat ani = new Cat();
//		Object ani = new Cat();
		// 위 다 가능 하지만 아래 바로 윗 부모로 해보자
		
		Animal ani = new Cat();
		ani.eat();	// 컴파일 시점 -> Animal -> 물음표가 나와야해 but 실행시점에서는 Cat의 eat()메서드가 된다. // UpCasting 기 때문
		
//		Cat c = (Cat)ani;	// DownCasting
//		c.night();
		// 위 두줄을 한줄로 쓸수도 있다
		((Cat)ani).night();
		
		ani = new Dog();
		ani.eat();
		// 다형성 -> 부모는 하나, 자식은 
		// 상위클래스가 하위클래스에게 동일한 메시지로 서로 다르게 동작시키는 객체지향 원리.
		
		System.out.println();
		System.out.println("---------");
		System.out.println();
		
		Object obj = new Dog();
//		obj.eat();	// 안돼. 왜냐면 Object에 eat() 메서드가 없자. 다운캐스팅해야지, 아래처
		((Dog)obj).eat();
	}

}
