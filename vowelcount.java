/* Write a Java method to count all vowels in a string. */
 
import java.io.*;
class vowelcount
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

		static void find()
		{
		char ch;
		int a=0;
			for(int i=0;i<l;i++)
			{
			ch = n.charAt(i);
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
			a++;
			}
		System.out.println("The vowels are:"+a);
		}
}