import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        for(int i=arr.length-1;i>=0;i--)
            System.out.print(arr[i]);
        
    }
}
