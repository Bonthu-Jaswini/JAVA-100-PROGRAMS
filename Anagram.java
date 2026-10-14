import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First String");
        String s1=sc.nextLine();
          System.out.println("Enter the Second String");
        String s2=sc.nextLine();
        char[] a=s1.toLowerCase().toCharArray();
        char[] b=s1.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))
            System.out.println("Given Two Strings are ANAGRAM");
        else
            System.out.println("Given Two Strings are NOT ANAGRAM");
        }
    }

