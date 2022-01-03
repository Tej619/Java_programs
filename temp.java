import java.io.*;
class temp
{
public static void main(String args[])
	{
	DataInputStream ds = new DataInputStream(System.in);
	double c;
	int f=0;
		try
		{
		System.out.println("Enter the Temperature in farenhiet");
		f = Integer.parseInt(ds.readLine());
		}
		catch(Exception e)
		{}
			c = (f-32) * (5.0/9.0);
			System.out.println("THe Temperature in celcius is"+c);
	}
}