import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		
		Cat cat = new Cat();
		cat.eat();
		cat.night();
		
		Animal dog1 = new Dog();	// 상속관계에서는 자동 형변환이 된다.	
		dog1.eat();
		
		Animal cat1 = new Cat();
		cat1.eat();
//		cat1.night();
		((Cat)cat1).night();	// 다운캐스팅을 해줘야 한다.
	}
}
