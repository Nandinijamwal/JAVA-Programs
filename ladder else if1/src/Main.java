import java.util.*;
public class Main{
    public static void main(String[] agrs){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1 for Welcome");
        System.out.println("2 for Hello");
        System.out.println("3 for Bye");
        int n=ob.nextInt();
        if (n==1)
        {
            System.out.println("Welcome");
        }
        else if (n==2)
        {
            System.out.println("Hello");
        }
        else if(n==3)
        {
            System.out.println("Bye");
        }
        else {
            System.out.println("INVALID CHOICE!!");
        }
    }
}