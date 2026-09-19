import java.util.*;
public class FactorialUsingLoop {
	public static void main(String []args){
    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter n value");
        double n=sc.nextDouble();
       double fact=1;
        for(double i=1;i<=n;i++)
            fact*=i;
System.out.println("factorial of "+n+" is: "+fact);
    }
}


        
	   
