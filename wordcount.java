/*  Write a Java method to count all words in a string */

import java.io.*;
class wordcount
{
static String n;
static int l;
public static void main(String args[]) throws IOException
	{
	BufferedReader ds = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the String");
	n = ds.readLine();
	l = n.length();
	find();
	}

		public static void find()
		{
		char ch;
		int a=0;
		 	for(int i=0;i<l;i++)
			{
			ch = n.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			a++;
			}
		System.out.println("THE no. of characters of STring are: "+a);
		}
}
