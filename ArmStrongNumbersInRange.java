
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start Number of Range: ");
        int a = sc.nextInt();

        System.out.print("Enter End Number of Range: ");
        int b = sc.nextInt();

        for (int n = a; n <= b; n++) {
            int original = n;
            int temp = n;
            int digits = String.valueOf(n).length();
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp = temp / 10;
            }

            if (sum == original)
                System.out.println(original + " is Armstrong Number");
        }

        sc.close();
    }
}
