import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Starting range");
        int a=sc.nextInt();
         System.out.println("Enter the  Ending range");
        int b=sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++){
            if(i%2==1){
                 sum=sum+i;
                
            }
        }
        System.out.println("Sum of Odd Numbers in give range is "+sum);
        }

    }     

        
