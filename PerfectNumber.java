import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
      
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
         if (original == sum) {
            System.out.println(original + " is a Perfect Number");
        } else {
            System.out.println(original + " is Not a Perfect Number");
        }
        
        sc.close(); 
    }
}
