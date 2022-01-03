import java.io.*;
class MyExcepion extends Exception
{
  MyException(String mg)
  {
   super(mg);
  }
}

class userexcep
{
public static void main(String args[])
	{
	BufferedReader bin = new BufferedReader(System.in);
	int a,b;
	System.out.println("Enter the values of A");
	a = Integer.parseInt(b.readLine());
	System.out.println("Enter the values of B");
	b = Integer.parseInt(bin.readLine());
		try
		{
		int c=a+b;
		if(c>99)
		throw new MyException("the number are too big");
		System.out.println(a+"+"+b+"="+c);
		}
		catch(Exception e)
		{
		System.out.println("The sum of numbers should be less than 99");
		System.out.println(e.getMessage());
		}
	}
}
	