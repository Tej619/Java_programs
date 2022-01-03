/* Write a Java Program to find number of uppercase and lowercase characters , blank spaces , digits and special characters from input string. */

import java.io.*;
class Stringcount
{
 static String n;
static int l;
public static void main(String args[]) throws IOException
	{
	BufferedReader ds = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a String");
	n = ds.readLine();
	l = n.length();
	
	find();
	}

		public static void find()
		{
			int a=0,b=0,c=0,d=0;
			char ch;
				for(int i=0;i<l;i++)
				{
				ch = n.charAt(i);
				if(ch>=65 && ch<=90)
				a++;
				if(ch>='a' && ch<='z')
				b++;
				if(ch>='0' && ch<='9')
				c++;
				if(ch == ' ')
				d++;
				}
			System.out.println("\n no.uppercase letters ="+a); 
			System.out.println("\n no.lowercase letters ="+b);
			System.out.println("\n no. of digits ="+c);
			System.out.println("\n no.of spaces ="+d);
			System.out.println("\n no.of special character
 ="+(l-(a+b+c+d)));
		}
}

