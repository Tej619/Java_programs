package ARea;
import java.util.Scanner;
abstract class Area
{
abstract void area();
}

class rectangle extends Area
{
Scanner s = new Scanner(System.in);
int l=0,b=0;
	
	void area()
	{
	System.out.println("Enter the length and breadth of rectangle");
	l = s.nextInt();
	b = s.nextInt();
	System.out.println("The area of rectangle is:"+(l*b));
	}
}

class square extends Area
{
Scanner s = new Scanner(System.in);
int n=0;
	
	void area()
	{
	System.out.println("Enter the side of square");
	n = s.nextInt();
	System.out.println("The area of square is:"+(n*n));
	}
}

class ARea
{
public static void main(String args[])
	{
	rectangle ob1 = new rectangle();
	ob1.area();
	square ob2 = new square();
	ob2.area();
	}
}