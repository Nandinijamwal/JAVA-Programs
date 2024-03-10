
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner ob = new Scanner(System.in);
        while (true) {
            System.out.println("Enter num 1 :");
            int num1 = ob.nextInt();
            System.out.println("Enter num 2 :");
            int num2 = ob.nextInt();
            if (num1 >= 0 && num2 >=0 && sum < 1000) {
                sum += num1 + num2;
                System.out.println("Sum = " + sum);
            } else {
                System.out.println("Stopping condition satisfied");
                break;
            }
        }
    }
}
