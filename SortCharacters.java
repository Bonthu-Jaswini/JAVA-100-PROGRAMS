import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        System.out.println(new String(arr));
         }
    }

