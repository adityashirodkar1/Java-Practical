import java.util.Scanner;
class Publication
{
    Scanner sc = new Scanner(System.in);
    int i=0;
    String publication;
    void getdata()
    {
        System.out.println("Enter the name of the publication:");
        publication = sc.nextLine();
    }
    void putdata() {}
}
class Sales extends Publication
{
    float[] dollar_sales = new float[3];
    void getdata()
    {
        super.getdata();
        for(i=0;i<3;i++)
        {
            System.out.println("Enter the dollar sales for month "+(i+1)+":");
            dollar_sales[i] = sc.nextFloat();
        }
    }
}
class Book extends Sales
{
    int page;
    void getdata()
    {
        super.getdata();
        System.out.println("Enter the number of pages:");
        page = sc.nextInt();
    }
    void putdata()
    {
        System.out.println((i+1)+".\t"+super.publication+"\t"+page+"\t"+super.dollar_sales[0]+"\t"+super.dollar_sales[1]+"\t"+super.dollar_sales[2]);
    }
}
class Tape extends Sales
{
    float min;
    void getdata()
    {
        System.out.println("Enter the playing time of the tape in minutes:");
        min = sc.nextFloat();
    }
    void putdata()
    {
        System.out.println((i+1)+".\t"+publication+"\t"+min+"\t"+dollar_sales[0]+"\t"+dollar_sales[1]+"\t"+dollar_sales[2]);
    }
}
public class Expt6_4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of publication:");
        String publication = sc.nextLine();
        if(publication.equalsIgnoreCase("Book"))
        {
            Publication book3 = new Book();
            book3.getdata();
            book3.putdata();
        }
        else
        {
            Publication tape = new Tape();
            tape.getdata();
            tape.putdata();
        }
        sc.close();
    }

}
