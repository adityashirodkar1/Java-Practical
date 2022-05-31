import java.util.Scanner;
class Date
{
	int year,month,hrs,min,sec,date;
	Date()
	{
		month = 01;
		date = 01;
		year = 2000;
		hrs = 00;
		min = 00;
		sec = 00;
	}
	void setDate(int year,int month,int date)
	{
		this.year = year;
		this.month = month;
		this.date = date;
	}
	void setDate(int year,int month,int date,int hrs,int min,int sec)
	{
		this.year = year;
		this.month = month;
		this.date = date;
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}
	void setDate(int year,int month,int day,int hrs,int min)
	{
		this.year = year;
		this.month = month;
		this.date = date;
		this.hrs = hrs;
		this.min = min;
	}
	void displayDate(int n)
	{
		switch(n)
		{
			case 1:
				System.out.printf("Date:- %d/%d/%d\n",date,month,year);
				break;
			case 2:
				System.out.printf("Date:- %d/%d/%d, %d:%d:%d\n",date,month,year,hrs,min,sec);
				break;
			case 3:
				System.out.printf("Date:- %d/%d/%d, %d:%d\n",date,month,year,hrs,min);
				break;
			default:
				System.out.println("Invalid option\n");
				break;
		}
			
	}
}
class Prog3ram1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Date ob1 = new Date();
		Date ob2 = new Date();
		Date ob3 = new Date();
		int year,month,date,hrs,min,sec;
		System.out.println("Enter the year:");
		year = sc.nextInt();
		System.out.println("Enter the month:");
		month = sc.nextInt();
		System.out.println("Enter the date:");
		date = sc.nextInt();
		System.out.println("MENU\n1 - In the form of DD/MM/YYYY\n2 - In the form of DD/MM/YYYY,00:00:00\n3 - In the form of DD/MM/YYYY,00:00");
		int n = sc.nextInt();
		if(n==1)
		{
			ob1.setDate(year,month,date);
			ob1.displayDate(1);
		}
		else if(n==2)
		{
			System.out.println("Enter the hours:");
			hrs = sc.nextInt();
			System.out.println("Enter the minutes:");
			min = sc.nextInt();
			System.out.println("Enter the seconds:");
			sec = sc.nextInt();
			ob2.setDate(year,month,date,hrs,min,sec);
			ob2.displayDate(2);
		}
		else if(n==3)
		{
			System.out.println("Enter the hours:");
			hrs = sc.nextInt();
			System.out.println("Enter the minutes:");
			min = sc.nextInt();
			ob3.setDate(year,month,date,hrs,min);
			ob3.displayDate(3);
		}
	}
}
