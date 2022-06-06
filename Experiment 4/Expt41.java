import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
class GradesStatistics
{
	int n,i=0;
	float sum=0;
	float med,std=0,avg;
	GradesStatistics(int n)
	{
		this.n = n;
	}
	void get(int mks,int [] grades)
	{
		grades[i] = mks;
		i++;
	}
	void display(int [] grades)
	{
		for(int j=0;j<n;j++)
		{
			sum += grades[j];
		}
		avg = sum/n;
		System.out.printf("The average is %.2f\n",avg);
		Arrays.sort(grades);
		System.out.printf("The min is %.2f\n",(float)grades[0]);
		System.out.printf("The max is %.2f\n",(float)grades[n-1]);
		if(n%2==0)
		{
			med = grades[n/2+1] + grades[n/2];
			System.out.printf("The median is %.2f\n",med/2);
		}
		else
		{
			System.out.printf("The median is %.2f\n",(float)grades[(n+1)/2]);
		}
		for(int k=0;k<n;k++)
		{
			std += (grades[k]- avg)*(grades[k]- avg);
		}
		System.out.printf("The standard deviation is %.2f\n",Math.sqrt(std));
	}
	
}
public class Expt41
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n = sc.nextInt();
		GradesStatistics ob = new GradesStatistics(n);
		int i,mks=0;
		int grades[] = new int[n];
		for(i=0;i<n;i++)
		{
			System.out.printf("Enter the grade of student %d\n-->",i+1);
			mks = sc.nextInt();
			sc.nextLine();
			ob.get(mks,grades);
		}
		ob.display(grades);
	}
}
