import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        int digits=0,specials=0;
        for(char ch:s.toCharArray()){
           if(Character.isDigit(ch)){
               digits++;
               
           }
            else if(!Character.isLetter(ch)){
                specials++;
            }
                }
            
            System.out.println("digits: "+digits);
            System.out.println("specials: "+specials);
          }
}
