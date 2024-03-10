import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking marks input
        System.out.println("Enter marks in JAVA: ");
        float ja= sc.nextFloat();
        System.out.println("Enter marks in SQL: ");
        float sq=sc.nextFloat();
        System.out.println("Enter marks in Computer Arch.: ");
        float ca=sc.nextFloat();
        System.out.println("Enter marks in Maths: ");
        float math=sc.nextFloat();
        float total=(ja+sq+ca+math);
        float per= total/4;
        System.out.println("Total marks: "+total);
        System.out.println("Percentage: "+per);
    }
}