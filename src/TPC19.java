import kr.tpc.Dog;
import kr.tpc.Animal;
import kr.tpc.Cat;

public class TPC19 {
	public static void main(String[] args) {
		// Dog, Cat class 설계하고 부모클래스인 Animal 클래스를 상속해보
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.eat();
		cat.eat();	// 위 eat()메서드와 중복된다.
		cat.night();
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		// 현재 Animal이 부모, cat과 dog가 상속을 받은상태
		Animal animal = new Dog();
		animal.eat();
		
		Animal animal2= new Cat();
		animal2.eat();
	}
}
