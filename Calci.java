/* Write a Program to define  a class Complex to represent a complex number and perform addition and subtraction operations on complex numbers . Pass objects as argument. */



import java.io.*;
import java.math.*;
class Complex
{
int real,img;
	Complex()
	{
	DataInputStream ds = new DataInputStream(System.in);
		try
		{
		System.out.println(" Real part :");
		real = Integer.parseInt(ds.readLine());
		System.out.println(" Imaginary part :");
		img = Integer.parseInt(ds.readLine());
		}
		catch(Exception e)
		{}
	}
}
 
class Calci
{
public static void main(String args[])
	{
	System.out.println("Enter The First Complex Number");
	Complex n1 = new Complex();
	System.out.println("Enter The Second Complex Number");
	Complex n2 = new Complex();
	System.out.println("Choose an operation : (+,-,/,*) :");
	char opt = ' ';
		try
		{
			opt = (char)System.in.read();
		}
		catch(IOException e)
		{}
			switch(opt)
			{
				case '+':Add(n1,n2);
				break;
				case '-':Sub(n1,n2);
				break; 
				case '*':Mult(n1,n2);
				break;
				case '/':Div(n1,n2);
				break;
				default : System.out.println("Invalid choice:");
			}
	}

static void Add(Complex a,Complex b)
{
	int r = a.real + b.real;
	int i = a.img + b.img;
	if(i>=0)
		System.out.println("Addition of entered Complex number : "+r+"+"+i+"i.");
	else
		System.out.println("Addition of entered Complex number : "+r+"-"+i*(-1)+"i.");
}
static void Sub(Complex a,Complex b)
{
	int r = a.real - b.real;
	int i = a.img - b.img;
	if(i>=0)
		System.out.println("Subtraction of entered Complex number : "+r+"+"+i+"i.");
	else
		System.out.println("Subtraction of entered Complex number : "+r+"-"+i*(-1)+"i.");
}
static void Mult(Complex a,Complex b)
{
	int r = a.real*b.real - a.img*b.img;
	int i = a.real*b.img + a.img*b.real;
	if(i>=0)
		System.out.println("Multiplicaion of entered Complex number : "+r+"+"+i+"i.");
	else
		System.out.println("Multiplication of entered Complex number : "+r+"-"+i*(-1)+"i.");
}
static void Div(Complex a,Complex b)
{
	double r = ((a.real*b.real + a.img*b.img)*1.0)/((b.real*b.real + b.img*b.img)*1.0);
	double i = ((a.real*b.img - a.img*b.real)*1.0)/((b.real*b.real + b.img*b.img)*1.0);;
	if(i>=0)
		System.out.println("Division of entered Complex number : "+r+"+"+i+"i.");
	else
		System.out.println("Division of entered Complex number : "+r+"-"+i*(-1)+"i.");
}	

}