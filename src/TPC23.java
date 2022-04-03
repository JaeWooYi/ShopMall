import kr.tpc.*;

public class TPC23 {
	public static void main(String[] args) {
		// 1. 다형성 인수
		Dog d = new Dog();
		display(d);
		Cat c = new Cat();
		display(c);
	}
	
	
	// 오버로딩이 굉장히 많아짐 -> 동물들이 많아지면
//	public static void display(Dog d) {}
//	public static void display(Cat c) {}
	
	// 그래서 동물들을 한번에 인자에 받으려면 어떻게 해야하는데.. 부모로 받으면 되
	public static void display(Animal a) {	// 이게 다형성 인수
		a.eat();
		if(a instanceof Cat) {
		((Cat)a).night();	// 그냥 이거만 쓰면 안돼. Cat타입일때만 가능한거야. -> 가능하게 하려면 이프문으로 감싸야해.
		}
	} 		
}
