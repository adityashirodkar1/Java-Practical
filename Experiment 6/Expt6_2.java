import java.util.Scanner;
class Employee
{
    double salary,bonus=0;
    double getSalary()
    {
        return 10000;
    }
    double getBonus()
    {
        return 0;
    }
    void display()
    {}
}
class Intern extends Employee
{
    double getSalary()
    {
        return 10000;
    }
    double getBonus()
    {
        return 3/4*getSalary();
    }
    void display()
    {
        System.out.println(getSalary()+getBonus());
    }
}
class Clerk extends Employee
{
    double getSalary()
    {
        return 10000;
    }
    double getBonus()
    {
        return 0.5*getSalary();
    }
    void display()
    {
        System.out.println(getSalary()+getBonus());
    }
}
class Manager extends Employee
{
    double getSalary()
    {
        return 10000;
    }
    double getBonus()
    {
        return 2*getSalary();
    }
    void display()
    {
        System.out.println(getSalary()+getBonus());
    }
}
public class Expt6_2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Employee ob1 = new Intern();
        Employee ob2 = new Clerk();
        Employee ob3 = new Manager();
        ob1.display();
        ob2.display();
        ob3.display();
    }    
}
