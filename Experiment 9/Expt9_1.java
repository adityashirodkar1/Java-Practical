import java.util.*;
class Cricketer
{
	Scanner sc = new Scanner(System.in);
	String player_name;
	double runs_hit, batting_avg;
	int innings_count, notout_count;
	void get_avg(int x)
	{
		System.out.print("Enter Player "+(x+1)+" name: ");
		player_name = sc.nextLine();
		System.out.print("Enter runs scored by Player "+(x+1)+": ");
		runs_hit = sc.nextDouble();
		System.out.print("Enter number of innings played by Player "+(x+1)+": ");
		innings_count = sc.nextInt();
		System.out.print("Enter number of innings Player "+(x+1)+" came not out: ");
		notout_count = sc.nextInt();
		batting_avg = runs_hit/((double)innings_count-(double)notout_count);
	}
	void sort(Cricketer [] players)
	{
		Arrays.sort(players,new Comparator<Cricketer>()
		{
			@Override
			public int compare(Cricketer o1, Cricketer o2)
			{
				return o1.batting_avg>o2.batting_avg?1:-1;
			}
		}
		);
	}
	void display(Cricketer [] players)
	{
		int k;
		for(k=0;k<players.length;k++)
		{
			System.out.printf("%d\t%s\t%d\t%d\t%.0f\t%.2f\n",(k+1),players[k].player_name,players[k].innings_count,players[k].notout_count,players[k].runs_hit,players[k].batting_avg);
		}
	}
}
public class Expt9_1
{
	public static void main(String[] args)
	{
		Cricketer players[] = new Cricketer[11];
		for(int i=0;i<11;i++)
		{
			players[i] = new Cricketer();
			players[i].get_avg(i);
		}
		players[0].sort(players);
		players[0].display(players);
	}
}
//System.out.println((k+1)+".\t"+players[k].player_name+"\t"+players[k].innings_count+"\t"+players[k].notout_count+"\t"+players[k].runs_hit+"\t"+players[k].batting_avg);
