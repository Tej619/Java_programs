/* Write a program that has two threads . One of the threads displays the even numbers  30 while the other displays odd numbers upto 30. */


class odd extends Thread
{
public void run()
	{
	int i;
		for(i=1;i<=30;i=i+2)
		{
		System.out.println(i);
		}
	}
}

class even extends Thread
{
public void run()
	{
	int i;
		for(i=0;i<=30;i=i+2)
		{
		System.out.println(i);
		}
	}
}

class evenoddthread
{
public static void main(String args[])
	{
	odd a = new odd();
	System.out.println("Odd nos. are:");
	Thread t1 = new Thread(a);
	even b = new even();
	System.out.println("Even nos. are:");
	t1.start();
	Thread t2 = new Thread(b);
	t2.start();
	}
}