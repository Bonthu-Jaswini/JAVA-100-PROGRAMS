
import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        s=s.toLowerCase();
       int vowels=0,consonants=0;
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                if("aeiou".indexOf(ch) !=-1){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
            System.out.println("Vowels: "+vowels);
            System.out.println("Consonants: "+consonants);
          }
}
