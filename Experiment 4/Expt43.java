import java.util.Scanner;
import java.lang.String;
class Movies
{
	String name,type,hero,heroine;
	long rupees;
	Movies(String n,String t,String h,String he,long r)
	{
		name = String.valueOf(n);
		type = String.valueOf(t);
		hero = String.valueOf(h);
		heroine = String.valueOf(he);
		rupees = r;
	}
	void display(int x)
	{
		x++;
		System.out.println(x+".\t"+name+"\t"+type+"\t"+hero+"\t"+heroine+"\t"+rupees);
	}
	void check()
	{
		System.out.println(name.length());
	}
	void as(int x)
	{
		if(name.charAt(0)=='A' || name.charAt(0)=='S')
		{
			x++;
			System.out.println(x+".\t"+name+"\t"+type+"\t"+hero+"\t"+heroine+"\t"+rupees);
		}
	}

}
class Expt43 
{
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		Movies obj[] = new Movies[n];
		Movies temp = new Movies("temp","temp","temp","temp",1000);
		int i,j;
        System.out.println("Enter the details:");
		for(i=0;i<n;i++)
		{
			String name = sc.nextLine();
			String type = sc.nextLine();
			String hero = sc.nextLine();
			String heroine = sc.nextLine();
			long rupees = sc.nextLong();
			sc.nextLine();
			obj[i] = new Movies(name,type,hero,heroine,rupees);
		}
		while(true)
		{
			System.out.println("In what what way you want to print the movies:\n1 - In decreasing order of their budget\n2 - Movies starting with A or S\n3 - Movie having the longest name");
			int x = sc.nextInt();
			switch(x)
			{
				case 1:
					for (j = 0; j < ( n - 1 ); j++) {
						for (int k = 0; k < n - j - 1; k++) {
						if (obj[k].rupees < obj[k+1].rupees) 
						{
							temp = obj[k];
							obj[k] = obj[k+1];
							obj[k+1] = temp;
						}
						}
					}
					System.out.println("List of movies in decreasing order of their budget:");
					System.out.println("Sr.No\tName of Movie\tGenre\tHero\tHeroine\tBudget");
					for(j=0;j<n;j++)
					{
						obj[j].display(j);
					}
					break;
				case 2:
					System.out.println("The movie(s) starting with A or S:");
					System.out.println("Sr.No\tName of Movie\tGenre\tHero\tHeroine\tBudget");
					for(j=0;j<n;j++)
					{
						obj[j].as(j);
					}
					break;
				case 3:
					int max = 0;
					for(j=1;j<n;j++)
					{
						if(obj[max].name.length() < obj[j].name.length())
							max = j;
					}
					System.out.println("The movie having the longest name:");
					System.out.println("Sr.No\tName of Movie\tGenre\tHero\tHeroine\tBudget");
					obj[max].display(1);
					break;
				default:
					System.out.println("Re-enter options");
					break;
			}
			System.out.println("If you want more information\n1 - Yes\n2 - No");
			int flag = sc.nextInt();
			if(flag==2)
				break;
		}
    }
}
