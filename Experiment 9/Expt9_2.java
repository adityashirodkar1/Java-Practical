import java.util.*;
class InvalidDaysException extends Exception
{
	InvalidDaysException(String s)
	{
		super(s);
	}
}
public class Expt9_2
{
	static void check(int x) throws InvalidDaysException
	{
		if(x<0 || x>100)
			throw new InvalidDaysException("Invalid input");
		else
			System.out.println("Nice input");
	} 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter difference:");
		try
		{
			int diff = sc.nextInt();
			check(diff);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		catch(Exception m)
		{
			System.out.println(m);
		}
		System.out.println("It's working!");
		
		sc.close();
	}
	
}
