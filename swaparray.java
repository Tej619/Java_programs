/* Write a program to swap contents of two arrays */

import java.util.Scanner;
class swaparray
{
public static void main(String args[])
	{
	int i,n;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the no. of elements in array");
	n = s.nextInt();
	int a[] = new int[n];
	int b[] = new int[n];
	System.out.println("Enter the elements of array 1");
		for(i=0;i<n;i++)
		{
		a[i] = s.nextInt();
		}
	System.out.println("Enter the elements of array 2");
		for(i=0;i<n;i++)
		{
		b[i] = s.nextInt();
		}
	System.out.println("Before swapping elemnets of array 1");
		for(i=0;i<n;i++)
		{
		System.out.println(+a[i]);
		}
	
	System.out.println("Before swapping elemnets of array 2");
		for(i=0;i<n;i++)
		{
		System.out.println(+b[i]);
		}

		for(i=0;i<n;i++)
		{
		int t = a[i];
		a[i] = b[i];
		b[i] = t;
		}
	
	
	System.out.println("after swapping elemnets of array 1");
		for(i=0;i<n;i++)
		{
		System.out.println(+a[i]);
		}


	System.out.println("After swapping elemnets of array 1");
		for(i=0;i<n;i++)
		{
		System.out.println(+b[i]);
		}
	}
}