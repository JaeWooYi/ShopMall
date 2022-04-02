import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		
		Cat cat = new Cat();
		cat.eat();
		cat.night();
		
		System.out.println();
		System.out.println("--------------");
		System.out.println();
		
		Animal animal = new Dog();	// 업캐스팅
		animal.eat();
			
		Animal animal2 = new Cat();	// 업캐스팅
		animal2.eat();
//		animal2.night();
		
		((Cat)animal2).night();	// 다운캐스팅
		
	}
}
