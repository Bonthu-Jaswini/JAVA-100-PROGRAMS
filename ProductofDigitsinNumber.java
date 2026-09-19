
import java.util.*;
public class RevereseTheNumber {
	public static void main(String []args){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter n value");
        int n=sc.nextInt();
        int product=1;
            
        while(n!=0){
            int digit=n%10;
            product=product*digit;
            n=n/10;

        }
        System.out.println("product of the digits in given Number is:"+product);
    }
       
}
            
        
	   
