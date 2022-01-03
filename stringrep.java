import java.util.Scanner;
class stringrep
{
public static void main(String args[])
	{
	String no[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};

	Scanner s = new Scanner(System.in);
	System.out.println("Enter an integer");
	int a = s.nextInt();
		if(a<no.length)
		{	
		System.out.println(no[a]+" is the String representation of entered no.");
		}
		else
		{
		System.out.println("Please enter the number between 0 to 10");
		}
	}
}

	
