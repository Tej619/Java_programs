import java.io.*;
class Areaofcircle
{
public static void main(String args[])
	{
	DataInputStream ds = new DataInputStream(System.in);
	int r=0;
	int side=0;
		try
		{System.out.println("Enter the Radius of circle");
		 r = Integer.parseInt(ds.readLine());
		 System.out.println("Enter the side of Rectangle");
		 side = Integer.parseInt(ds.readLine());
		}
		catch(Exception e)
		{}
			final double pie=3.142;
			double area=0;
			area=pie*r*r;
			System.out.println("The area of ciecle is ");
System.out.println(area);
System.out.println("The Area of rectangle is"+(side*side));
	}
}
		