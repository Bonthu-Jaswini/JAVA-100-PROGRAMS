import java.util.*;
class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int sum=0;
        int digits=String.valueOf(n).length();
        while(n!=0){
            int digit=n%10;
            sum+=Math.pow(digit,digits);
            n=n/10;
        }
        if(sum==original)
            System.out.println(sum+" is ArmStrong Number");
        else
            System.out.println(sum+ " is Not ArmStrong Number");
    }
}
