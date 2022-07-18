import java.util.*;
class InvalidBalanceException extends Exception
{
	InvalidBalanceException(String s)
	{
		super(s);
	}
}
class SavingsAccount extends Account
{
	double interest_rate = 2;
	double interest;
	void set_minbalance(double mb)
	{
		min_balance = mb;
	}
	void deposit(double d)
	{
		balance += d;
	}
	void withdraw(double w)
	{
		balance -= w;
	}
	void addinterest()
	{
		interest = (balance*2*interest_rate)/100;
		balance += interest;
	}
	void display()
	{
		System.out.println("The balance is Rs. "+balance);
	}	
}
public class Expt9_3
{
	static void check(double balance,double min_balance) throws InvalidBalanceException
	{
		if(balance < min_balance)
		{
			if(balance<0)
				throw new InvalidBalanceException("Your balance is going less than zero!");
			else
				throw new InvalidBalanceException("Your balance is going less than the minimum balance set by you!");
		}
		else
			System.out.println("Your balance is more than the minimum balance set by you");
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			Account bank = new SavingsAccount();
			System.out.println("Do you want to set minimum balance?\n1 - Yes\n2 - No");
			int i = sc.nextInt();
			if(i==1)
			{
				System.out.println("Minimum balance should be:");
				double minbal = sc.nextDouble();
				bank.set_minbalance(minbal);
			}
			System.out.println("Which action do you want to perform?\n1 - Deposition\n2 - Withdrawl");
			int k = sc.nextInt();
			switch(k)
			{
				case 1: 
					System.out.println("Enter deposit money:");
					double deposit = sc.nextDouble();
					bank.deposit(deposit);
					try
					{
						bank.addinterest();
						check(bank.balance,bank.min_balance);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					bank.display();
					break;
				case 2:
				System.out.println("Enter withdrawl money:");
					double withdraw = sc.nextDouble();
					bank.withdraw(withdraw);
					try
					{
						bank.addinterest();
						check(bank.balance,bank.min_balance);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					bank.display();
					break;
				default:
					System.out.println("Re-enter opt");
					break;
			}
			System.out.println("Want to perform more transactions?\n1 - Yes\n2 - No");
			int flag = sc.nextInt();
			if(flag==2)
				break;
		}

		sc.close();
	}
}
