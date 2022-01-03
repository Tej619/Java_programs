import java.util.Scanner;
 class Stringconcate
{
public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	String s1,s2;
	System.out.println("Enter the 1st string:");
	s1 = s.nextLine();
	System.out.println("Enter the 2nd string:");
	s2 = s.nextLine();
	System.out.println("\n Before Conacatination,\n String 1 is:"+s1);
	System.out.println("\n String 2 is :"+s2);
	String s3= s1+s2;
	System.out.println("\n After Concatination,\n String is :"+s3);
	}
}