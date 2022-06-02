import java.util.Scanner;
import java.lang.Math;
class Test
{
	double base,ans;
	int power,logBase,argument;
	Test()
	{
		base = 2;
		power = 2;
		logBase = 2;
		argument = 2;
	}
	double logarithm(double b,double arg)
	{
		double res;
		res = Math.log(arg)/Math.log(b);
		return res;
	}
	double calculate(double base,int power)
	{
		ans = Math.pow(base,power);
		return ans;
	}
	double calculate(int logBase,int argument)
	{
		ans = logarithm(logBase,argument);
		return ans;
	}
	void display()
	{
		System.out.println(ans);
	}
	
}
class Prog3ram3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Test ob1 = new Test();
		while(true)
		{
			System.out.println("What operation you want to perform:\n1 - Power\n2 - Logarithm");
			int n = sc.nextInt();
			if(n==1)
			{
				System.out.println("Enter the base:");
				double base = sc.nextDouble();
				System.out.println("Enter the power:");
				int power = sc.nextInt();
				ob1.calculate(base,power);
				ob1.display();
			}
			else
			{
				System.out.println("Enter the base:");
				int logBase = sc.nextInt();
				System.out.println("Enter the argument:");
				int arg = sc.nextInt();
				ob1.calculate(logBase,arg);
				System.out.println("The answer is ");
				ob1.display();
			}
			System.out.println("Do want to perform more:\n1 - Yes\n2 - No");
			int flag = sc.nextInt();
			if(flag==2)
				break;
		}
	}
}
