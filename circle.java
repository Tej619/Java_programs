/*  Write a Java Program to calculate area and perimeter of the circle and triangle using multilevel inheritance */

import java.util.Scanner;
 class circle
{
protected double a;
}
 class area extends circle
{
double area;
public void read()
	{
	System.out.println("Enter the value of the radius");
	Scanner s = new Scanner(System.in);
	a = s.nextInt();
	}
public void display()
	{
	area = 3.142*a*a;
	System.out.println("area is"+area);
	}
}

class circumference extends area
{
double circum;
public void Display()
	{
	circum=(area/a)*2;
	System.out.println("Circunference is "+circum);
	}
}

class triangle
{
protected double a,b,c,l,k;
}
  class AREA extends triangle
  {
   double areas,d;
public void read()
	{
	System.out.println("Enter the sides and length and height of triangle");
	a = s.nextDouble();
	b = s.nextDouble();
	c = s.nextDouble();
	l = s.nextDouble();
	k = s.nextDouble();
	}
public void display()
	{
	areas = 0.5*b*l;
	System.out.println("area is:"+areas);
	}
}

   class perimeter extends AREA
   {
   double peri;
public void Display()
	{
	peri = a+b+c;
	System.out.println("perimeter is:"+peri);
	}
}
   


class circletriangle
{
public static void main(String args[])
	{
	int g;
	System.out.println("do you want the details of circle press 1 if triangle press 2:");
	Scanner s = new Scanner(System.in);
	g = nextInt();
	
		switch(g)
		{
		case 1: circumference a = new circumference();
		a.read();
		a.display();
		a.Display();
		break;
		
		case 2: perimeter b = new perimeter();
		b.read();
		b.display();
		b.Display();
		break;
		
		default: System.out.println("Invalid choice");
		break;
		}
	}
}