import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //INPUTS
        System.out.println("Enter no: ");
        int num = sc.nextInt();
        System.out.println("Num: "+num);
        int num2=++num;
        System.out.println("Num new: "+num);
        System.out.println("Num2 pre: "+num2);
        int num3=num++;
        System.out.println("Num new: "+num);
        System.out.println("Num3 post: "+num3);
    }
}