import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String result=" ";
        for(char ch:s.toCharArray()){
            if(result.indexOf(ch)==-1){
                result+=ch;
            }
        }
        System.out.println("After removing the duplicates the string is"+result);
        }
    }

