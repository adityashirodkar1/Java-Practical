import java.util.Scanner;
import java.lang.Math;
import java.util.Calendar;
class Bank
{
	double rate_of_interest,amount;
	double time_period;
	Bank(double time_period)
	{
		this.time_period = time_period/365;
	}
	double get_rate_of_interest() {return 2;}
	void calculation() {}
}
class SBI_Bank extends Bank
{
	SBI_Bank(double time_period)
	{
		super(time_period);
	}
	double get_rate_of_interest()
	{
		if(time_period>=7 && time_period<=45)
			rate_of_interest = 3;
		else if(time_period>=46 && time_period<=90)
			rate_of_interest = 4.05;
		else if(time_period>=91 && time_period<=180)
			rate_of_interest = 4.10;
		return rate_of_interest;
	}
	void calculation()
	{
		amount = 10000*Math.pow((1 + (get_rate_of_interest()/100)),time_period);
		System.out.printf("The amount at the end will be %.2f\n",amount);
	}
}
class ICICI_Bank extends Bank
{
	ICICI_Bank(double time_period)
	{
		super(time_period);
	}
	double get_rate_of_interest()
	{
		if(time_period>=7 && time_period<=14)
			rate_of_interest = 3.10;
		else if(time_period>=15 && time_period<=30)
			rate_of_interest = 3.20;
		else if(time_period>=31 && time_period<=45)
			rate_of_interest = 3.50;
		else if(time_period>=46 && time_period<=90)
			rate_of_interest = 4.50;
		else if(time_period>=91 && time_period<=120)
			rate_of_interest = 4.70;
		else if(time_period>=121 && time_period<=180)
			rate_of_interest = 4.90;
		return rate_of_interest;
	}
	void calculation()
	{
		amount = 12500*Math.pow((1 + (get_rate_of_interest()/100)),time_period);
		System.out.printf("The amount at the end will be %.2f\n",amount);
	}
}
class AXIS_Bank extends Bank
{
	AXIS_Bank(double time_period)
	{
		super(time_period);
	}
	double get_rate_of_interest()
	{
		if(time_period>=7 && time_period<=30)
			rate_of_interest = 3.15;
		else if(time_period>=31 && time_period<=45)
			rate_of_interest = 3.45;
		else if(time_period>=46 && time_period<=90)
			rate_of_interest = 4.05;
		else if(time_period>=91 && time_period<=120)
			rate_of_interest = 4.70;
		else if(time_period>=121 && time_period<=180)
			rate_of_interest = 5;
		return rate_of_interest;
	}
	void calculation()
	{
		amount = 20000*Math.pow((1 + (get_rate_of_interest()/100)),time_period);
		System.out.printf("The amount at the end will be %.2f\n",amount);
	}
}
public class Expt6_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - SBI Bank\n2 - ICICI Bank\n3 - AXIS Bank");
		int i = sc.nextInt();
		System.out.printf("\nEnter the no. of days\n--> ");
		int t = sc.nextInt();
		switch(i)
		{
			case 1:
				Bank ob1 = new SBI_Bank(t);
				ob1.calculation();
				break;
			case 2:
				Bank ob2 = new ICICI_Bank(t);
				ob2.calculation();
				break;
			case 3:
				Bank ob3 = new AXIS_Bank(t);
				ob3.calculation();
				break;
		}
	}	
}
