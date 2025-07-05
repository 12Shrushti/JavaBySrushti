class AbstractionEx2{
	public static void main(String[] args) {
		Shape s1= new Circle();
		s1.draw();
		s1.show();

		Shape s2 = new Rectangle();
		s2.draw();
		s2.show();
		
	}
}
abstract class Shape{
	abstract void draw();

	   void show(){
	   	System.out.println("Showing the Shape ");
	}
}
class Rectangle extends Shape{
	void draw(){
		System.out.println("Drawing a Rectangle");
	}
}
class Circle extends Shape{
	void draw(){
		System.out.println("Drawing a circle ");
	}
}