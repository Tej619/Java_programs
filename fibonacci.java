/*  Write a program to generate Fibonacci series using constructor. */

import java.util.Scanner;
class Fibo
{
int n;
	Fibo()
	{
	int a;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number of fobanacci series");
	a = s.nextInt();
		for(int i=1;i<=a;i++)
		{
		System.out.println("The fibonacci series is:"+(fibo(i))+" ");
		}
	}
		void fibo(int a)
		{
		if(a == 1)
		return 0;
		else if(a == 2)
		return 1;
		else
		return(fibo(n-1)+fibo(n-2));
		}
}

class fibonacci
{
public static void main(String args[])
	{
	 new Fibo();
	}
}
	
		
	
	