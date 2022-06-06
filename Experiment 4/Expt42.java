import java.util.Scanner;
import java.util.Arrays;
class Book
{
    int books,readers;
    float sum;
    float avg[] = new float[4];
    Book(int r)
    {
	readers = r;
    }
    void average(int [][] arr)
    {
        for(int i=0;i<4;i++)
        {
            sum = 0;
            for(int j=0;j<readers;j++)
            {
                sum += arr[i][j];
            }
            avg[i] = sum/readers;
        }
    }
    void check()
    {
        int i, max_ind = 0;
        for(i=1;i<4;i++)
        {
            if(avg[max_ind]<avg[i])
                max_ind = i;
        }
        System.out.println("The most popular book is BOOK "+(max_ind+1)+" having average rating "+avg[max_ind]);
    }
}
public class Expt42 
{
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of readers:");
		int r = sc.nextInt();
		Book ob = new Book(r);
		int rating[][] = new int[4][r];
		for(int i=0;i<4;i++)
		{
            		System.out.printf("Enter the ratings for the %d book\n",i+1);
			for(int j=0;j<r;j++)
			{
                		System.out.printf("Rating %d: ",j+1);
				rating[i][j] = sc.nextInt();
				sc.nextLine();
			}
		}
        	ob.average(rating);
        	ob.check();
    	}    
}

