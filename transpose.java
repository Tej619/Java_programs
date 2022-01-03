/* Write a program to transpose a matrix */

import java.util.Scanner;
class transpose
{
public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the no. of row of Matrix");
	int n = s.nextInt();
	System.out.println("Enter the no. of coulmn of Matrix");
	int m = s.nextInt();
	int b[][] = new int[n][m];
	int a[][] = new int[n][m];
	System.out.println("Enter the elements of matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
			a[i][j] = s.nextInt();
			System.out.println(" ");
			}
		}

		System.out.println("Entered matrix before transpose: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
			System.out.println(+a[i][j]+"\t ");
			}
			System.out.println();
		}
for(int i=0;i<n;i++)
{
for(int j=0;j<i;j++)
{
int t = a[i][j];
a[i][j] = a[j][i];
a[j][i] = t;
}
}


		System.out.println("Transpose of matrix : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
			System.out.println(+a[i][j]+"\t ");
			}
			System.out.println();
		}

	}
}