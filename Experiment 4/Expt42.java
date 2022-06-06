import java.util.Scanner;
import java.util.Arrays;
class Book
{
	int books,readers;
	Book(int r)
	{
		book = 4;
		readers = r;
	}
}
public class Expt42
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of readers:");
		int r = sc.nextInt();
		Book ob = new Book(n,r);
		int rating[][] = new int[4][r];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<r;j++)
			{
				rating[i][j] = sc.nextInt();
				sc.nextLine();
			}
		}
		
		
	}
}
