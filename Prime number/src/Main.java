import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        int count=0;
        for (int i=2;i<=num;i++)
        {
            if (num%i==0)
            {
                count=count+1;
            }
        }
        if (count==1)
        {
            System.out.println("PRIME");
        }
        else
        {
            System.out.println("NOT PRIME");
        }
    }
}