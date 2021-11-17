//simple example of polymorphism with shapes, especially triangle and circle. Can add more later on!
class shapes {
	public void area() {
		System.out.println("The formula for area of ");
	}
}
class Triangle extends shapes {
	public void area() {
		System.out.println("Triangle is 1/2 * base * height ");
	}
}
class Circle extends shapes {
	public void area() {
		System.out.println("Circle is 3.14 * radius^2 ");
	}
}
class Square extends shapes {
	public void area() {
		System.out.println("Square is base * height ");
	}
}
public class polymorphism {
	public static void main(String[] args) {
		//creating basic shape object
		shapes myShape = new shapes();
		//creating objects for new triangle, circle, and square
		shapes myTriangle = new Triangle();
		shapes myCircle = new Circle();
		shapes mySquare = new Square();
		myShape.area();
		myTriangle.area();
		myCircle.area();
		mySquare.area();
	}
}

