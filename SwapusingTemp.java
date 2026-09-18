import java.util.*;
class SwapusingTemp{
  public static void main(String []args){
    int temp;
    Scanner sc=new Scanner (System.in);
    System.out.println("enter a,b values");
    int a=sc.nextInt();
    int b=sc.nextInt();
    temp=a;
    a=b;
    b=temp;
    System.out.println("a="+a,"b="+b);
  }
}

    
