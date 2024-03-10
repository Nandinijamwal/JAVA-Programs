import java.util.*;
public class Info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //INPUTS
        System.out.println("Enter Rollno: ");
        int Rollno = sc.nextInt();
        System.out.println("Enter Name: ");
        String Name=sc.next();
        System.out.println("Enter Grade: ");
        char Grade=sc.next().charAt(0);
        System.out.println("Enter Marks: ");
        float Marks=sc.nextFloat();
        System.out.println("Enter Percentage: ");
        double per=sc.nextDouble();

        //OUTPUT
        System.out.println("Name: "+Name+ " Roll Number: "+Rollno+ " Marks: "+Marks+ " Percentage: "+per+ " Grade: "+Grade);
    }
}