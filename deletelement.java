/* Write a program to delete an element in an array */

import java.util.Scanner;
class deletelement
{
public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	int n,c=0,ele=0,i,d=0,k;
	System.out.println("Enter the no. of elements of array");
	n = s.nextInt();
	int a[] = new int[n];
	System.out.println("enter the elements");
		for(i=0;i<n;i++)
		{
		a[i] = s.nextInt();
		}
	System.out.println("Enter the element you want to delete");
	ele = s.nextInt();
		for(k=0;k<=n;k++)
		{
			for(i=0;i<n;i++)
			{
			if(a[i] == ele);
				{
				d++;
					for(int j=i;j<n;j++)
					{
					a[j] = a[j+1];
					}
				c++;
				}
			}
		}

		if(c==0)
		{
		System.out.println("Element not found");
		}
		else
		{
		System.out.println("Element deleted successfully");
		System.out.println("The new Array is");
		for(i=0;i<n-d;i++)
		System.out.println(+a[i]);
		}
	}
}


 