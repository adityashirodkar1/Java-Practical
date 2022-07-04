import java.util.Scanner;
import java.lang.String;
abstract class AmusementPark
{
    int age,extra_game=0;
    String day;
    double entry_fee;
    abstract void getCost(int [] arr,int n);
}
class Esselworld extends AmusementPark
{
    Esselworld(int age,String day)
    {
        this.age = age;
        this.day = day;
    }
    void getCost(int [] games,int n)
    {
        if(age>=21 && age<=60)
        {
            entry_fee = 1050;
            if(day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday"))
            {
                entry_fee += 300;
            }
        }
        else if(age<21 || age>60)
        {
            entry_fee = 660;
            if(day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday"))
            {
                entry_fee += 300;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(games[i]>7)
            {
                extra_game++;
                entry_fee += 50;
            }
        }
        System.out.println("Games\tGames having extra charge(Rs. 50)\tDay of the week\tExtra charge due to weekend\tTotal extra charge\tTotal amount");
        if(day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday"))
        {
            System.out.println(games.length+"\t\t"+extra_game+"\t\t"+day+"\t\t300\t\t"+(extra_game*50+300)+"\t\t"+entry_fee);       
        }
        else
            System.out.println(games.length+"\t\t"+extra_game+"\t\t\t\t"+day+"\t\t-\t\t"+(extra_game*50)+"\t\t"+entry_fee);
    }
}
class Imagica extends AmusementPark
{
    Imagica(int age,String day)
    {
        this.age = age;
        this.day = day;
    }
    void getCost(int [] games,int n)
    {
        if(age>=21 && age<=60)
        {
            entry_fee = 1500;
            if(day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday"))
            {
                entry_fee += 300;
            }
        }
        else if(age<21 || age>60)
        {
            entry_fee = 1100;
            if(day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday"))
            {
                entry_fee += 300;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(games[i]>7)
                entry_fee =+ 50;
        }
    }
}
public class Expt7_3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        AmusementPark person[] = new Esselworld[5];
        AmusementPark person_i[] = new Imagica[5];
        int i = 0;
        while(true)
        {
            System.out.println("In which amusement park did you go?\n1 - Essel World\n2 - Imagica");
            int k = sc.nextInt();
            if(k==1)
            {
                System.out.println("Enter your age:");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter on which day you went:");
                String day = sc.nextLine();
                person[i] = new Esselworld(age,day);
                System.out.println("Enter the number of games you played:");
                int n = sc.nextInt();
                int games[] = new int[n];
                for(int j=0;j<n;j++)
                {
                    games[j] = sc.nextInt();
                    sc.nextLine();
                }
                person[i].getCost(games,n); 
            }
            else
            {
                System.out.println("Enter your age:");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter on which day you went:");
                String day = sc.nextLine();
                person_i[i] = new Imagica(age,day);
                System.out.println("Enter the number of games you played:");
                int n = sc.nextInt();
                int games[] = new int[n];
                for(int j=0;j<n;j++)
                {
                    games[j] = sc.nextInt();
                    sc.nextLine();
                }
                person_i[i].getCost(games,n); 
            }
            i++;
            System.out.println("Do you want to continue?\n1 - Yes\n2 - No:");
            int flag = sc.nextInt();
            if(flag == 2)
                break;
        }
        sc.close();
    }
}
