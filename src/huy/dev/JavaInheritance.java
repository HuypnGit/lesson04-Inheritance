package huy.dev;

import huy.dev.Circle;
import huy.dev.Shape;
import huy.dev.Square;
import huy.dev.Triangle;

public class JavaInheritance {

	public static void main(String[] args) {
		Shape shape[] =new Shape[10];
		shape[0]= new Square(1,2){};
		shape[1]= new Square(1,2){};
		shape[2]= new Circle(5){};
		shape[3]= new Circle(7){};
		shape[4]= new Triangle(5,2,4){};
		shape[5]= new Triangle(3,2,4){};
		shape[6]= new Triangle(2,2,4){};
		shape[7]= new Square(1,2){};
		shape[8]= new Circle(8){};
		shape[9]= new Triangle(6,3,4){};
	for (int i = 0;i<shape.length;i++) {
		System.out.println("Dien tich la :"+shape[i].dientich());
		}
	for (int i = 0;i<shape.length;i++) {
		}
	}
}

