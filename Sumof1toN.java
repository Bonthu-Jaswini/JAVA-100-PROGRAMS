//First Method
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n=sc.nextInt();
        int result=0;
       // int result=(n*(n+1))/2;
        for(int i=1;i<=n;i++){
            result+=i;
        }
        System.out.println(result);
        
         }
}


//Second Method
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n=sc.nextInt();
       int result=(n*(n+1))/2;
        System.out.println(result);
        
         }
}

