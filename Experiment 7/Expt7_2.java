import java.util.Scanner;
import java.lang.String;
class Westside
{
    static int clothes = 10;
    static int accessories = 10;
}
abstract class Payment
{
    int expiration_date;
    long creditcard_no;
    String name;
    double payment = 25000;
    abstract void PaymentDetails(int x,int y);
    abstract void display();
}
class CashPayment extends Payment
{
    //CashPayment(){}
    void PaymentDetails(int x,int y)
    {
        if(payment >= x*5000)
        {
            if(Westside.clothes >= x)
            {
                if(x!=0)
                {
                    payment -= x*5000;
                    Westside.clothes -= x;
                    System.out.println("You bought clothes for Rs. "+(x*5000));
                }
            }
            else
                System.out.println("Clothes are out of stock!");
        }
        else
            System.out.println("Not enough money to buy clothes!");
        if(payment >= y*5000)
        {
            if(Westside.accessories >= y)
            {
                if(y!=0)
                {
                    payment -= y*5000;
                    Westside.accessories -= y;
                    System.out.println("You bought accessories for Rs. "+(y*5000));
                }
            }
            else
                System.out.println("Accessories are out of stock!");
        }
        else
            System.out.println("Not enough money to buy accessories!");
    }
    void display()
    {
        System.out.println("Your balance is Rs. "+payment);
        System.out.println("clothes = "+Westside.clothes+"\naccessories = "+Westside.accessories);
    }
}
class CreditCashPayment extends Payment
{
    CreditCashPayment(String name,int expiration_date,long creditcard_no)
    {
        this.name = name;
        this.expiration_date = expiration_date;
        this.creditcard_no = creditcard_no;
    }
    void PaymentDetails(int x,int y)
    {
        if(payment >= x*5000)
        {
            if(Westside.clothes >= x)
            {
                if(x!=0)
                {
                    payment -= x*5000;
                    Westside.clothes -= x;
                    System.out.println("You bought clothes for Rs. "+(x*5000));
                }
            }
            else
                System.out.println("Clothes are out of stock!");
        }
        else
            System.out.println("Not enough money to buy "+x+" clothes!");
        if(payment >= y*5000)
        {
            if(Westside.accessories >= y)
            {
                if(y!=0)
                {
                    payment -= y*5000;
                    Westside.accessories -= y;
                    System.out.println("You bought accessories for Rs. "+(y*5000));
                }
            }
            else
                System.out.println("Accessories are out of stock!");
        }
        else
            System.out.println("Not enough money to buy "+y+" accessories!");
        
    }
    void display()
    {
        System.out.println("Credit Card Details:\n1. Name: "+name+"\n2. Expiration Date: "+expiration_date+"\n3. Number: "+creditcard_no);
        System.out.println("Your balance is Rs. "+payment);
        System.out.println("clothes = "+Westside.clothes+"\naccessories = "+Westside.accessories);
    }
}
public class Expt7_2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Payment person[] = new CashPayment[5];
        Payment person_c[] = new CreditCashPayment[5];
        String name;
        int expiration_date;
        long number;
        //System.out.println("Which person wants to buy something");
        for(int i=0;i<5;i++)
        {
            System.out.println("For Person "+(i+1)+":");
            System.out.println("What do you want to buy?\n1 - Clothes\n2 - Accessories\n3 - Both");
            int n = sc.nextInt();
            if(n==1)
            {
                System.out.print("How many clothes you want to buy\n-->");
                int clothes = sc.nextInt();
                System.out.println("By which method would you like to pay?\n1 - Cash\n2 - Credit Card");
                int k = sc.nextInt();
                if(k==1)
                {
                    person[i] = new CashPayment();
                    person[i].PaymentDetails(clothes,0);
                    person[i].display();
                }
                else
                {
                    System.out.println("Enter your Credit Card Details:\n1 - Name\n2 - Expiration Date\n3 - Credit Card Number");
                    name = sc.next();
                    expiration_date = sc.nextInt();
                    number = sc.nextLong();
                    person_c[i] = new CreditCashPayment(name,expiration_date,number);
                    person_c[i].PaymentDetails(clothes,0);
                    person_c[i].display();
                }
            }
            else if(n==2)
            {
                System.out.print("How many accessories you want to buy\n-->");
                int accessories = sc.nextInt();
                System.out.println("By which method would you like to pay?\n1 - Cash\n2 - Credit Card");
                int k = sc.nextInt();
                if(k==1)
                {
                    person[i] = new CashPayment();
                    person[i].PaymentDetails(0,accessories);
                    person[i].display();
                }
                else
                {
                    System.out.println("Enter your Credit Card Details:\n1 - Name\n2 - Expiration Date\n3 - Credit Card Number");
                    name = sc.next();
                    expiration_date = sc.nextInt();
                    number = sc.nextLong();
                    person_c[i] = new CreditCashPayment(name,expiration_date,number);
                    person_c[i].PaymentDetails(0,accessories);
                    person_c[i].display();
                }
            }
            else
            {
                System.out.print("How many clothes you want to buy\n-->");
                int clothes = sc.nextInt();
                System.out.print("How many accessories you want to buy\n-->");
                int accessories = sc.nextInt();
                System.out.println("By which method would you like to pay?\n1 - Cash\n2 - Credit Card");
                int k = sc.nextInt();
                if(k==1)
                {
                    person[i] = new CashPayment();
                    person[i].PaymentDetails(clothes,accessories);
                    person[i].display();
                }
                else
                {
                    System.out.println("Enter your Credit Card Details:\n1 - Name\n2 - Expiration Date\n3 - Credit Card Number");
                    name = sc.next();
                    expiration_date = sc.nextInt();
                    number = sc.nextLong();
                    person_c[i] = new CreditCashPayment(name,expiration_date,number);
                    person_c[i].PaymentDetails(clothes,accessories);
                    person_c[i].display();
                }
            }
            System.out.println("\n");
            
        }
        sc.close();
    }
}
