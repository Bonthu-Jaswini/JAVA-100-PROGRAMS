import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println("Enter your target character");
        char target=sc.next().charAt(0); 
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch==target)
                count++;
            
        }
        System.out.println("The Occurence of Target Character is: "+count);
        
          }
}
