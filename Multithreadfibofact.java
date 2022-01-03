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


class Even extends Thread
{
 int no;
 Even(int even)
 {
  super("This Is Even Thread");
  no = even;
 }
 
 public void run()
 {
  try
  {
  for(int i=1;i<=no;i++)
  {
   if(i % 2 == 0)
   {
   System.out.print(i+" ");
   sleep(500);
   }
  }
  }
   catch(Exception e)
	{}
  }


class Multithreadfibofact
{
public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number of terms of fibonacci:");
	int n = s.nextInt();
	System.out.println("Enter no. of factorial");
	int f = s.nextInt();
	new Fibo(n);
	new Even(f);
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
		