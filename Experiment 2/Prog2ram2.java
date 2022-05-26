import java.util.Scanner;
class Fraction
{
	int a,b,c,d;
	int res_num, res_den;
	int div,div1;
	Fraction()
	{
		a = 1;
		b = 1;
		c = 1;
		d = 1;
	}
	void get(int n1, int d1,int n2, int d2)
	{
		a = n1;
		b = d1;
		c = n2;
		d = d2;
	}
	int grcd(int num1, int num2)
	{
		int i,gcd = 1;
		for(i=1;i<=num1 && i<=num2;++i)
		{
			if(num1%i==0 && num2%i==0)
				gcd = i;	
		}
		return gcd;
	}
	void add()
	{
		res_num = (a*d + b*c);
		res_den = (b*d);
		div = grcd(res_num,res_den);
		System.out.printf("Addition : %d/%d\n",(res_num/div),(res_den/div));
	}
	void sub()
	{
		res_num = (a*d - b*c);
		res_den = (b*d);
		div = grcd(res_num,res_den);
		System.out.printf("Subtraction : %d/%d\n",(res_num/div),(res_den/div));
	}
	void multi()
	{
		res_num = a*c;
		res_den = b*d;
		div = grcd(res_num,res_den);
		System.out.printf("Multiplication : %d/%d\n",(res_num/div),(res_den/div));
	}
	void div()
	{
		res_num = (a*d);
		res_den = (b*c);
		div = grcd(res_num,res_den);
		System.out.printf("Division : %d/%d\n",(res_num/div),(res_den/div));
	}
	void Table(int deno)
	{
		int k;
		System.out.printf("\t");
		for(k=1;k<deno;k++)
		{
			div1 = grcd(k,deno);
			System.out.printf("%d/%d\t",(k/div1),(deno/div1));
		}
		System.out.printf("\n");
		int i,j;
		for(i=1;i<deno;i++)
		{
			div1 = grcd(i,deno);
			System.out.printf("%d/%d\t",(i/div1),(deno/div1));
			for(j=1;j<deno;j++)
			{
				res_num = i*j;
				res_den = deno*deno;
				div = grcd(res_num,res_den);
				System.out.printf("%d/%d\t",(res_num/div),(res_den/div));
			}
			System.out.printf("\n");
		}
	}
}
class Prog2ram2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Fraction ob = new Fraction();
		System.out.println("Enter the numerator of 1st number:");
		int n1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the denominator of 1st number:");
		int d1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the numerator of 2nd number:");
		int n2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the denominator of 2nd number:");
		int d2 = sc.nextInt();
		sc.nextLine();
		ob.get(n1,d1,n2,d2);
		System.out.println("1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\n5 - Multiplication Table");
		System.out.println("Enter the option you want:");
		int i = sc.nextInt();
		switch(i)
			{
				case 1:
					ob.add();
					break;
				case 2:	
					ob.sub();
					break;
				case 3:
					ob.multi();
					break;
				case 4:
					ob.div();
					break;
				case 5:
					System.out.println("Enter the denominator:");
					int x = sc.nextInt();
					sc.nextLine();
					ob.Table(x);
					break;
				default:
					System.out.printf("Acchese option daal!");
					break;
			}
		}
}
