import java.util.*;
class publication
{protected String title;
protected int price;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the title and price");
title=sc.nextLine();
price=sc.nextInt();
}
void putdata()
{
System.out.println("the title is :"+title);
System.out.println("the price is :"+price);
}
}
class book extends publication
{int paper_count;
void getdata()
{super.getdata();
Scanner sc=new Scanner(System.in);
System.out.println("enter the paper count");
paper_count=sc.nextInt();
}
void putdata()
{
    super.putdata();
System.out.println("the page count is :"+paper_count);
}
}
class tape extends publication
{double playing_time;
void getdata()
{super.getdata();
Scanner sc=new Scanner(System.in);
System.out.println("enter the playing time");
playing_time=sc.nextDouble();
}
void putdata()
{super.putdata();
System.out.println("the playing time is :"+playing_time);
}
}
 class Main
{
           public static void main(String args[])
    {           int data;
                tape t=new tape();
                book b=new book();
                    System.out.println("enter the option one for book and second for tape");
                        Scanner sc=new Scanner(System.in);
                                data=sc.nextInt();
                                    switch(data)
                                        {       
                                             case 1:
                                                    b.getdata();
                                                    b.putdata();
                                             break;
                                               case 2:
                                                    t.getdata();
                                                    t.putdata();
                                               break;
                                            default:
                                                    System.out.println("wrong option");
                                                break;
                                        }
}}
