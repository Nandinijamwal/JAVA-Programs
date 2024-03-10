import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //INPUTS
        System.out.println("Enter no: ");
        int num = sc.nextInt();
        if(num>=0)
        {
            System.out.println("POSITIVE");
        }
        else
        {
            System.out.println("NEGATIVE");
        }
        }
    }