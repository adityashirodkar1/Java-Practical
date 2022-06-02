import java.util.Scanner;
class Line
{
	double m,c,x1,y1,x2,y2;
	double x = 4;
	Line(double m,double c)
	{
		this.m = m;
		this.c = c;
		System.out.printf("y = %.0fx + %.0f\n",m,c);
		System.out.printf("y = %.2f at x = %.2f",(m*x)+c,x);
	}
	Line(double m,double x1,double y1)
	{
		this.m = m;
		this.x1 = x1;
		this.y1 = y1;
		System.out.printf("y - %.0f = %.0f(x - %.0f)\n",y1,m,x1);
		System.out.printf("y = %.2f at x = %.2f",(m*(x-x1))+y1,x);
	}
	Line(double x1,double y1,double x2,double y2)
	{
		this.m = m;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		System.out.printf("(y - %.0f)/%.0f = (x - %.0f)/%.0f\n",y1,(y2-y1),x1,(x2-x1));
		System.out.printf("y = %.2f at x = %.2f",((x-x1)/(x2-x1))*(y2-y1)+y1,x);
	}
}
class Prog3ram2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("In which format you want to display:\n1 - Slope y-intercept form\n2 - Slope point form\n3 - Two point form");
			
			int n = sc.nextInt();
			switch(n)
			{
				case 1:
					System.out.println("Enter the slope and the y-intercept:");
					double m = sc.nextDouble();
					double c = sc.nextDouble();
					Line ob1 = new Line(m,c);
					break;
				case 2:
					System.out.println("Enter the slope and the x and y co-ordinates:");
					m = sc.nextDouble();
					double x1 = sc.nextDouble();
					double y1 = sc.nextDouble();
					Line ob2 = new Line(m,x1,y1);
					break;
				case 3:
					System.out.println("Enter the x and y co-ordinates of both the points:");
					x1 = sc.nextDouble();
					y1 = sc.nextDouble();
					double x2 = sc.nextDouble();
					double y2 = sc.nextDouble();
					Line ob3 = new Line(x1,y1,x2,y2);
					break;
				default:
					System.out.println("Re-enter options");
					break;
			}
			System.out.println("\nIf you want more equations\n1 - Yes\n2 - No");
			int flag = sc.nextInt();
			if(flag==2)
				break;
				
		}
		
	}
}
