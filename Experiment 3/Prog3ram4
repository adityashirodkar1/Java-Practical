import java.util.Scanner;
class Posting
{
    int courseWork,AptTest,TechTest,interview,check=0;
    Posting(int courseWork,int AptTest,int TechTest,int interview)
    {
        this.courseWork = courseWork;
        this.AptTest = AptTest;
        this.TechTest = TechTest;
        this.interview = interview;
       
        
    }
    Posting(int TechTest,int interview)
    {
        this.TechTest = TechTest;
        this.interview = interview;
        
    }
    Posting(int interview)
    {
        this.interview = interview;

    }
    void check1()
    {
        check = courseWork+AptTest+TechTest+interview;
        if(check>=80)
            System.out.println("Congratulations, You are hired as our Programmer!");
        else
            System.out.println("Marks were lower than the required minimum. Try your best the next time.");
    }
    void check2()
    {
        check = TechTest+interview;
        if(check>=85)
            System.out.println("Congratulations, You are hired as our Team Leader!");
        else
            System.out.println("Marks were lower than the required minimum. Try your best the next time.");
    }
    void check3()
    {
        check = interview;
        if(check>=90)
            System.out.println("Congratulations, You are hired as our Project Manager!");
        else
            System.out.println("Marks were lower than the required minimum. Try your best the next time.");
    }
}
public class Prog3ram4
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option for the job you want to apply:\n1 - Programmer\n2 - Team Leader\n3 - Project Manager");
		int i = sc.nextInt();
		switch(i)
		{
		    case 1:
		        System.out.println("Enter your marks for Course Work:");
		        int courseWork = sc.nextInt();
		        System.out.println("Enter your marks for Aptitude test:");
		        int AptTest = sc.nextInt();
		        System.out.println("Enter your marks for Technical test:");
		        int TechTest = sc.nextInt();
		        System.out.println("Enter your marks for Interview:");
		        int interview = sc.nextInt();
		        Posting ob1 = new Posting(courseWork,AptTest,TechTest,interview);
		        ob1.check1();
		        break;
		    case 2:
		        System.out.println("Enter your marks for Technical test:");
		        TechTest = sc.nextInt();
		        System.out.println("Enter your marks for Interview:");
		        interview = sc.nextInt();
		        Posting ob2 = new Posting(TechTest,interview);
		        ob2.check2();
		        break;
		     case 3:
		        System.out.println("Enter your marks for Interview:");
		        interview = sc.nextInt();
		        Posting ob3 = new Posting(interview);
		        ob3.check3(); 
		        break;
		     default:
		        System.out.println("Let me give you an advice.\nForget about getting a job in any of the renowned companies in India related to Techinical field.\nGo do something else.");
		        break;
		}
	}
}
