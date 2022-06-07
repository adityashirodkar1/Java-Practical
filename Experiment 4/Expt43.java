import java.util.*;
class Movies
{
	static String name;
	String type,hero,heroine;
	static long rupees;
	Movies(String name,String type,String hero,String heroine,long rupees)
	{
		this.name = name;
		this.type = type;
		this.hero = hero;
		this.heroine = heroine;
		this.rupees = rupees;
	}
	void display()
	{
		//char c1 = name.charAt(0);
		//if(c1=='S')
		//{
			System.out.println(name);
			System.out.println(type);
			System.out.println(hero);
			System.out.println(heroine);
			System.out.println(rupees);
		//}
	}
}
public class Expt43
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Movies obj[] = new Movies[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			String name = sc.nextLine();
			String type = sc.nextLine();
			String hero = sc.nextLine();
			String heroine = sc.nextLine();
			sc.nextLine();
			long rupees = sc.nextLong();
			obj[i] = new Movies(name,type,hero,heroine,rupees);
		}
		/*for(j=0;j<n;j++)
		{
			obj[j].display();
		}*/
		System.out.println(obj[1].name);
	}
	
}
