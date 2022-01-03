/*  Write a program that reads an array of numbers ,calculates and displays the row and column total and displays grand total. */

import java.util.Scanner;
class arraytotal
{
public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	int a,b,c=0,d=0,i=0,j=0;
	System.out.println("Enter the number of rows:");
	a = s.nextInt();
	System.out.println("Enter the number of column:");
	b = s.nextInt();
	int n[][] = new int[a][b];

	System.out.println("Enter the elements");
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
			n[i][j] = s.nextInt();
			}
		}
			for(i=0;i<a;i++)
			{
				for(j=0;j<a;j++)
				{
				c = c + n[i][j];
				}
			System.out.println("The SUm for row is :"+(i+1)+"="+c);
			}

			
	}
}
	