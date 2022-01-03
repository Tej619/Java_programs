import java.io.*;
class reve
{
public static void main(String args[])
	{
	DataInputStream ds = new DataInputStream(System.in);
	int n=0;
	int temp=0;
	int sum=0;
		try
		{
		System.out.println("Enter the number");
		n = Integer.parseInt(ds.readLine());
		}
		catch(Exception e)
		{}
			while(n!=0)
			{
			sum = n%10;
			temp = temp*10 + sum;
			n=n/10;
			}
			System.out.println("Reverse of the above number is" +temp);
	}
}