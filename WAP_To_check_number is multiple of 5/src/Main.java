import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //INPUTS
        System.out.println("Enter no: ");
        int num = sc.nextInt();
        if(num%5==0)
        {
            System.out.println("Yes! It is a multiple of 5");
        }
        else
        {
            System.out.println("No! It is not a multiple of 5");
        }
    }
}