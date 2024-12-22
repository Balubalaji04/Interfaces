import java.util.Scanner;
 abstract interface Shapes{
		abstract void collectData();
		abstract void calculate();
		abstract void display();
	}
	class AreaCircle1 implements Shapes{
		double radius;
		static double pi;
		static{
			pi=3.14;
		}
		double areaCircle;
		
		@Override
		public void collectData() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the radius of circle:");
			radius=sc.nextDouble();
			
			}
		@Override
		public void calculate(){
			areaCircle=pi*radius*radius;
		}
		@Override
		public void display() {
			System.out.println("Area of Circle:"+areaCircle);
		}
		
	}
	class AreaRectangle implements Shapes{
		double length;
		double bredth;
		double areaRectangle;
		@Override
		public void collectData() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the length of rectangle:");
			length=sc.nextDouble();
			System.out.println("Enter the bredth of rectangle:");
			bredth=sc.nextDouble();
			
			}
		@Override
		public void calculate(){
			areaRectangle=length*bredth;
		}
		@Override
		public void display() {
			System.out.println("Area of Rectangle:"+areaRectangle);
		}
		
	}
	class AreaSquare implements Shapes{
		double length;
		double areaSquare;
		@Override
		public void collectData() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the length of square:");
			length=sc.nextDouble();
			}
		@Override
		public void calculate(){
			areaSquare=length*length;
		}
		@Override
		public void display() {
			System.out.println("Area of Rectangle:"+areaSquare);
		}
		
	}

public class InterfaceCSR {

	public static void main(String[] args) {
		AreaCircle1 ac=new AreaCircle1();
		AreaRectangle ar=new AreaRectangle();
		AreaSquare as=new AreaSquare();
		ac.collectData();
		ac.calculate();
		ac.display();
		ar.collectData();
		ar.calculate();
		ar.display();
		as.collectData();
		as.calculate();
		as.display();

	}

}
