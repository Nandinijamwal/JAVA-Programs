import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("MEASUREMENT CONVERSION");
        System.out.println("Enter Magnitude in any unit: ");
        int mag = ob.nextInt();
        System.out.println("Choose Parameter to convert:\n1.Length\n2.Weight\n3.Volume");
        int c = ob.nextInt();
        if (c == 1) {
            System.out.println("mm to cm: " + mag / 10+"cm");
            System.out.println("cm to m: " + mag / 100+"m");
            System.out.println("m to km: " + mag / 1000+"km");
        } else if (c == 2) {
            System.out.println("mg to g: " + mag / 1000+"g");
            System.out.println("g to kg: " + mag / 1000+"kg");
        } else if (c == 3) {
            System.out.println("ml to L: " + mag / 1000+"L");
        } else {
            System.out.println("Invalid choice");
        }
    }
}