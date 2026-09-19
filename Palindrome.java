// Online Java Compiler
// Use this editor to write, compile and run your Java code o
import java.util.*;
public class Palindrome {
	public static void main(String []args){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter n value");
        int n=sc.nextInt();
        int original=n;
        int digit;
        int rev=0;
        while(n!=0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(original==rev)
            System.out.println("n is Palindrome");
        else
            System.out.println("n is not palindrome");
        
    }
}
        
            
        
	   
