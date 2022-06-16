import java.util.*;
class Testing
{
	Scanner sc = new Scanner(System.in);
	int correct_ans[] = {2,1,1,1,2,2,1,2};
	int ans[] = new int[8];
	int person;
	void takeTest(int x)
	{
		person = x;
		System.out.printf("Section 1\n1. What is the vision of the company?\n1 - To become a Unicorn\n2 - To Automate Life\n-->");
		ans[0] = sc.nextInt();
		System.out.printf("2. How long will you stay in this role?\n1 - >10 years\n2 - <10 years\n-->");
		ans[1] = sc.nextInt();
		System.out.printf("Section 2\n1. What is the final method in Java?\n1 - To define constants\n2 - To access variable from super class\n-->");
		ans[2] = sc.nextInt();
		System.out.printf("2. What is the latest version of Java?\n1 - Java SE 18\n2 - Java SE 22\n-->");
		ans[3] = sc.nextInt();
		System.out.printf("Section 3\n1. What did you learn about Java in last job?\n1 - Noob\n2 - Pro\n-->");
		ans[4] = sc.nextInt();
		System.out.printf("2. What do you wish to learn?\n1 - Nothing\n2 - Something\n-->");
		ans[5] = sc.nextInt();
		System.out.printf("Section 4\n1. What makes a team successful?\n1 - Teamwork\n2 - Individual Skills\n-->");
		ans[6] = sc.nextInt();
		System.out.printf("2. Do you work faster in team or as individual?\n1 - Individual\n2 - Team\n-->");
		ans[7] = sc.nextInt();
	}		
}
class Recruitment extends Testing
{
	double passed;
	void check()
	{
		int i,ctr=0;
		for(i=0;i<8;i++)
		{
			if(ans[i]==correct_ans[i])
				ctr++;
		}
		passed = ((double)ctr/8)*100;
	}
	
	
}
public class TesterAB
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Recruitment obj[] = new Recruitment[6];
		int i=0;
		Recruitment temp = new Recruitment();
		for(i=0;i<6;i++)
		{
			System.out.printf("Person %d:\n",i+1);
			obj[i] = new Recruitment();
			obj[i].takeTest(i+1);
			obj[i].check();			
		}
		for(int j=0;j<6-1;j++)
		{
			for(int k=0;k<6-j-1;k++)
			{
				if(obj[k].passed>obj[k+1].passed)
				{
					temp = obj[k];
					obj[k] = obj[k+1];
					obj[k+1] = temp;
				}
			}
		}
		for(i=3;i<6;i++)
		{
			if(obj[i].passed >= 60)
				System.out.printf("Person %d is eligible\n",obj[i].person);	
		}
	}
}
