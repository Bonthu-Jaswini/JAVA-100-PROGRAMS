import java.util.*;
class Largestofthree{
  public static void main(String []args){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter a,b,c values");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>=b && a>=c)
      System.out.println("a is Larger");
     else if(b>=a && b>=c)
       System.out.println("b is Larger");
    else
      System.out.println("c is Larger");
  }
}
