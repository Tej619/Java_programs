import java.util.Scanner;
class arms
{
public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	int n=0,r=0,i=0;
	int t,sum;
	System.out.println("Enter the Number");
	n = s.nextInt();
	
		for(i=0;i<n;i++)
		{
		t=i;
		sum =0;
			while(t>0)
			{
			r = t % 10;
			sum = sum + (r*r*r);
			t = t / 10;
			}
				if(sum == i)
				{
				System.out.println(i+"\t");
				}
		}
	}
}		