import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        {
            int sum = 0;
            Scanner ob = new Scanner(System.in);
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" #");
                }
                System.out.print("\n");
            }
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" "+i);
                }
                System.out.print("\n");
        }
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" "+j);
                }
                System.out.print("\n");
            }
        }
    }
}
