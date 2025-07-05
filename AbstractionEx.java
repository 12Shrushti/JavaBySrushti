class AbstractionEx{
	public static void main(String[] args) {
		Animal ab = new Dog();
		ab.sound(); // 

	}
}
abstract class Animal{
	abstract void sound();

	void eat(){
		System.out.println("This animal eats food");
	}

}
class Dog extends Animal{
	void sound(){
		System.out.println("DOG BARKS");
	}
}