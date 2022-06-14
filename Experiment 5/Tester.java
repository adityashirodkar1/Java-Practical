import java.util.Scanner;
class Employee
{
	private int age;
	private String name,id;
	Employee(int age,String id,String name)
	{
		this.age = age;
		this.id = id;
		this.name = name;
	}
	//getters
	int getage() {return age;}
	String getid() {return id;}
	String getname() {return name;}
	//setters
	void setage(int age) {this.age = age;}
	void setid(String id) {this.id = id;}
	void setname(String name) {this.name = name;}
	
	
}
class SalariedEmployee extends Employee
{
	private double empsalary;
	SalariedEmployee(int age,String id,String name,double empsalary)
	{
		super(age,id,name);
		setsal(empsalary);
	}
	//setter
	void setsal(double sal) {empsalary = sal;}
	//getter
	double getsal() {return empsalary;}
	void check(int n)
	{
		if(n==1)
		{
			empsalary += 2000;
		}
	}
	void display(int x)
	{
		x++;
		System.out.println(x+".\t"+getname()+"\t"+getid()+"\t"+getage()+"\t"+getsal());
	}
}
public class Tester
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		SalariedEmployee temp = new SalariedEmployee(20,"temp","temp",1000);
		SalariedEmployee emp[] = new SalariedEmployee[5];
		int i,j;
		for(i=0;i<5;i++)
		{
			System.out.print("Enter the employee name:");
			String name = sc.next();
			System.out.print("Enter the employee id:");
			String id = sc.next();
			System.out.print("Enter the employee age:");
			int age = sc.nextInt();
			System.out.print("Enter the employee salary:");
			double salary = sc.nextInt();
			sc.nextLine();
			emp[i] = new SalariedEmployee(age,id,name,salary);
			System.out.print("If the employee is permanent - enter 1\nIf the employee is contractual - enter 2 ");
			int n = sc.nextInt();
			emp[i].check(n);
		}
		for(i=0;i<4;i++)
		{
			for(j=0;j<5-i-1;j++)
			{
				if(emp[j].getsal() < emp[j+1].getsal())
				{
					temp = emp[j];
					emp[j] = emp[j+1];
					emp[j+1] = temp;
				}
			}
		}
		System.out.println("Sr.No\tEmployee Name\tEmployee ID\tEmployee Age\tEmployee Salary");
		for(i=0;i<5;i++)
		{
			emp[i].display(i);
		}
	}
}
