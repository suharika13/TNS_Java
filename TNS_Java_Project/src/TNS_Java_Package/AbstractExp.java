package TNS_Java_Package;

abstract class Shape {
	int area;
	public abstract void calArea();
	public void show() {
		System.out.println("The area of the shape is " + area);	}
}

class Square extends Shape {
	int side;
	Square(int side){
		this.side = side;
	}
	public void calArea() {
		super.area = side * side;
	}
}

class Rectangle extends Shape {
	int length;
	int bredth;
	Rectangle(int length, int bredth){
		this.length = length;
		this.bredth = bredth;
	}
	public void calArea() {
		super.area = length * bredth;
	}
}
public class AbstractExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square(4);
		sq.calArea();
		sq.show();
		
		Rectangle re = new Rectangle(5,4);
		re.calArea();
		re.show();
		
	}

}
