
import java.util.Scanner;
class elementsearch
{
public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter The total number of elements");
	int n = s.nextInt();
	int a[] = new int[n];
	System.out.println("Enter the elements: \n");
		for(int i=0;i<n;i++)
		{
		a[i] = s.nextInt();
		}
	System.out.println("Enter the no. you want to search");
	int ele = s.nextInt();
	int f=0,i;
		for(i=0;i<n;i++)
		{
			if(a[i]==ele)
			{
			f=1;
			System.out.println("Element found at location :"+(i+1));
			break;
			}
			else
			{
			System.out.println("Elemnt not found");
			break;
			}
		}
	}
}
 