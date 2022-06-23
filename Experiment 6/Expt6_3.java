import java.util.*;
import java.lang.Math;
class Shape
{
	Scanner sc = new Scanner(System.in);
	double side1,side2,side3,radius,side,s,area;
	void getSide()
	{ }
	double getArea()
	{
		return 0;
	}
	double getPerimeter()
	{
		return 0;
	}
}
class Triangle extends Shape
{
	void getSide()
	{
		System.out.println("Enter the three sides of the triangle:");
		side1 = sc.nextDouble();
		side2 = sc.nextDouble();
		side3 = sc.nextDouble();
	}	
	double getArea()
	{
		s = (side1 + side2 + side3)/2;
		area = s*(s-side1)*(s-side2)*(s-side3);
		area = Math.sqrt(area);
		return area;
	}
	double getPerimeter()
	{
		return side1 + side2 + side3;
	}
}
class Circle extends Shape
{
	void getSide()
	{
		System.out.println("Enter the radius\n-->");
		radius = sc.nextDouble();
	}	
	double getArea()
	{
		return Math.PI*radius*radius;
	}
	double getPerimeter()
	{
		return Math.PI*2*radius;
	}
}
class Pentagon extends Shape
{
	void getSide(double side,double temp1,double temp2)
	{
		System.out.println("Enter the side of the pentagon\n-->");
		side = sc.nextDouble();
	}	
	double getArea()
	{
		double constant = Math.sqrt(5*(5+2*Math.sqrt(5)));
		return constant/4*side*side;
	}
	double getPerimeter()
	{
		return 5*side;
	}
}
public class Expt6_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("For which shape do you want to find the area/perimeter?\n1 - Circle\n2 - Triangle\n3 - Pentagon");
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				Shape ob1 = new Circle();
				ob1.getSide();
				System.out.println("The area of circle is "+ob1.getArea());
				System.out.println("The perimeter of circle is "+ob1.getPerimeter());
				break;
			case 2:
				Shape ob2 = new Triangle();
				ob2.getSide();
				System.out.printf("The area of triangle is %.2f\n",ob2.getArea());
				System.out.println("The perimeter of triangle is "+ob2.getPerimeter());
				break;
			case 3:
				Shape ob3 = new Pentagon();
				ob3.getSide();
				System.out.println("The area of pentagon is "+ob3.getArea());
				System.out.println("The perimeter of pentagon is "+ob3.getPerimeter());
				break;
			default:
				System.out.println("Error!");
				break;
		}
	}
}
