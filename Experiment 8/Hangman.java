import java.util.Scanner;
import java.lang.Math;
import java.rmi.server.SocketSecurityException;
import java.util.Arrays;
interface RandWord
{
	public String[] words = new String[10];
	public void initDictionary();
	public String ChooseRandomWord();
}
class Game implements RandWord
{
	public void initDictionary()
	{			
		words[0] = "RAINBOW";
		words[1] = "CODE";
		words[2] = "COLLEGE";
		words[3] = "HOUSE";
		words[4] = "DINOSAUR";
		words[5] = "WORLD";
		words[6] = "INTELLECT";
		words[7] = "GOD";
		words[8] = "OCEAN";
		words[9] = "UNIVERSE";
	}
	public String ChooseRandomWord()
	{
		int index;
		index = (int)Math.random()*10;
		return words[index];		
	}
	
}
public class Hangman
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int chance=8,flag1=0,flag2=0;
		//String temp1;
		RandWord ob = new Game();
		ob.initDictionary();
		String word = ob.ChooseRandomWord();
		System.out.println("Welcome to Hangman!");
		int len = word.length();
		char[] temp = new char[len];
		for(int j=0;j<len;j++)
		{
			temp[j] = '-';
		}
		System.out.println(word);
		for(int j=0;j<len;j++)
		{
			System.out.print(temp[j]);
		}
		//char[] temp = temp1.toCharArray();
		System.out.println("\n");
		while(chance!=0)
		{
			System.out.println("Enter any letter:");
			char letter = sc.next().charAt(0);
			for(int j=0;j<len;j++)
			{
				if(word.charAt(j)==letter)
				{
					System.out.println(word.charAt(j));
					temp[j] = letter;
				}
			}
			for(int q=0;q<len;q++)
			{
				System.out.print(temp[q]);
			}
			System.out.println("\n");
			for(int j=0;j<len;j++)
			{
				if(word.charAt(j)==letter)
				{
					flag1 = 1;
					break;
				}
				else
					flag1 = 0;
			}
			for(int j=0;j<len;j++)
			{
				if(temp[j]=='-')
				{
					flag2 = 0;
					break;
				}
				else
					flag2 = 1;
			}
			if(flag2==1)
			{
				System.out.println("Congratulations! You won");
				break;
			}
			if(flag1==0)
			{
				chance--;
				System.out.println("Wrong letter");
				for(int j=0;j<len;j++)
				{
					System.out.print(temp[j]);
				}
			}
		}
		sc.close();
	}
}
