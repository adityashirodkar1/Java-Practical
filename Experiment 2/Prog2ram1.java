import java.util.Scanner;
import java.lang.Math;
class Banking
{
	double rate;
	double initial_bal;
	double compound_interest;
	Banking()
	{
		rate = 3.5;
		initial_bal = 1000;
	}
	void deposit(int d)
	{
		initial_bal = initial_bal + d;
		System.out.println("The final balance is Rs. "+initial_bal);
	}
	void withdraw(int w)
	{
		if(w > initial_bal)
		{
			System.out.println("The withdrawl amount is more then the balance!");
		}
		else if(initial_bal!=0)
		{
			initial_bal = initial_bal - w;
			System.out.println("The final balance is Rs. "+initial_bal);
		}
		else
			System.out.println("Your balance is zero");
			
	}
	void compound(int t)
	{
		double initial1;
		double temp1 = 1 + rate/100;
		double temp = Math.pow(temp1,t);
		initial1 = initial_bal*temp;
		compound_interest = initial1 - initial_bal;
		System.out.println("The compound interest is Rs."+compound_interest+" and the final amount will be Rs. "+initial1);
	}
	double finalbalance()
	{
		return initial_bal;
	}
}
public class Prog2ram1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Banking ob = new Banking();
		int flag=1;
		while(flag!=0)
		{
			System.out.println("Menu:");
			System.out.println("1 - Deposit\n2 - Withdraw\n3 - Compound Interest");
			System.out.println("Enter what action you want to perform:");
			int i = sc.nextInt();
			sc.nextLine();
			switch(i)
			{
				case 1:
					System.out.println("Enter the amount you want to deposit:");
					int d = sc.nextInt();
					sc.nextLine();
					ob.deposit(d);
					break;
				case 2:	
					System.out.println("Enter the amount you want to withdraw:");
					int w = sc.nextInt();
					sc.nextLine();
					ob.withdraw(w);
					break;
				case 3:
					System.out.println("Enter the time period:");
					int t = sc.nextInt();
					sc.nextLine();
					ob.compound(t);
					break;
				default:
					System.out.println("Re-enter your options");
					break;
			}
			System.out.println("Do you want to continue (y/n):");
			char c = sc.next().charAt(0);
			if(c=='y')
				flag = 1;
			else
				flag = 0;
		}
		
	}
}
