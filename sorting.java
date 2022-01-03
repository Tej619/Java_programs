/*  Write a program to sort the array in ascending and descending order . */
import java.util.Scanner;
class sorting
{
public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	int n=0,i=0;
	System.out.println("Enter the no. of elements of array:");
	n = s.nextInt();
	int a[] = new int[n];
	System.out.println("Enter the elements of array");
		for(i=0;i<n;i++)
		{
		a[i] = s.nextInt();
		}
			System.out.println("Elements in ascending order are:");
			for(i=0;i<n-1;i++)
			{
				for(int j=0;j<n-1-i;j++)
					if(a[j]>a[j+1])
					{
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					}
			}
			{
			for(i=0;i<n;i++)
			System.out.println(+a[i]);
			}

			System.out.println("Elements in desending order are:");
			for(i=0;i<n-1;i++)
			{
				for(int j=0;j<n-1-i;j++)
					if(a[j]<a[j+1])
					{
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					}
			}
			{
			for(i=0;i<n;i++)
			System.out.println(+a[i]);
			}

	}
}