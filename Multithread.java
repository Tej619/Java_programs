/* Write a program that has two threads . One of the threads displays the elements of Fibonacci series upto 100 while the other displays even numbers upto 30. */

import java.util.Scanner;
class Fibo extends Thread
{
int n;
	Fibo(int a)
	{
	super("FiboThread");
	n = a;
	start();
	}
		public void run()
		{
		  try
		  {
		  for(int i=1;i<=n;i++)
			{
			System.out.println(fibo(i)+" ");
			Thread.sleep(500);
			}
		   }
		   catch(InterruptedException e)
		   {
		   System.out.println("Fibo Thread Inturrupted");
		   }
		}
			int fibo(int n)
			{
			if(n==1)
				return 0;
			else if(n==2)
				return 1;
			else
				return(fibo(n-1)+fibo(n-2));
			}
}

class Fact extends Thread
{
int n;
	Fact(int a)
	{
	super("FactThread");
	n = a;
	start();
	}
		public void run()
		{
		  try
		   {
		    long fact =1;
		    for(int i=n;i>0;i--)
		     {
		      fact = fact*i;
		      Thread.sleep(500);
		     }
			System.out.println("Factorial of entered number is :"+fact);
		    }
		catch(InterruptedException e)
		{
		System.out.println("Fact Thread Inturrupted");
		}
	}
}

class Multithread
{
public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number of terms of fibonacci:");
	int n = s.nextInt();
	System.out.println("Enter no. of factorial");
	int f = s.nextInt();
	new Fibo(n);
	new Fact(f);
		try
		{
		Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
		System.out.println("Main thread interrupted");
		}
	}
}
		