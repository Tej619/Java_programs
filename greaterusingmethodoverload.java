
import java.util.Scanner;
class Input
{
	int a;
	Input()
	{
	Scanner s = new Scanner(System.in);
	a = s.nextInt();
	}
	void greater(Input b)
	{
	System.out.println(a+" is Greater than "+b.a+".");
	}
	void greater(int i,Input b)
	{
	System.out.println(b.a+" is greater than "+a+".");
	}
}
class greaterusingmethodoverload
{
public static void main(String args[])
	{
	System.out.println("Enter First number");
	Input a = new Input();
	System.out.println("Enter Second number");
	Input b = new Input();
		if(a.a>b.a)
		{
		a.greater(b);
		}
		else
		{
		a.greater(5,b);
		}
	}	
}