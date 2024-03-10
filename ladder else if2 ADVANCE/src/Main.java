//1-Luxury for 800 with 10% D
//2-Premium for 500 with 8% D
//3-Deluxe for 300 with 5% D
//Total tickets, total amount, discount, Cost

import java.util.*;
public class Main {
    public static void main(String[] agrs)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter your choice:\n1-Luxury- ₹800\n2-Premium- ₹500\n3-Deluxe- ₹300");
        int n=ob.nextInt();
        System.out.println("Enter number of tickets:");
        int ti=ob.nextInt();
        float cost=0;
        double dis=0;
        double amount=0;
        if(n==1)
        {
           cost= 800*ti;
           dis= 0.1*cost;
           amount=cost-dis;
            System.out.println("Total amount: "+cost);
            System.out.println("10% Discount: "+dis);
            System.out.println("Total Payable Amount: "+amount);
        }
        else if(n==2)
        {
            cost= 500*ti;
            dis= 0.08*cost;
            amount= (float) (cost-dis);
            System.out.println("Total amount: "+cost);
            System.out.println("8% Discount: "+dis);
            System.out.println("Total Payable Amount: "+amount);
        } else if (n==3) {
            cost= 300*ti;
            dis= (float) (0.05*cost);
            amount=cost-dis;
            System.out.println("Total amount: "+cost);
            System.out.println("5% Discount: "+dis);
            System.out.println("Total Payable Amount: "+amount);
        }
        else {
            System.out.println("INVALID CHOICE!!");
        }
    }
}