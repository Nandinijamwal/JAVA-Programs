//calculate bill, first 100 units=₹1.5, 100-200 units=₹2, above 200 units ₹2.5

import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter units of electricity consumed: ");
        float units=ob.nextFloat();
        float cost=0;
        if(units<=100)
        {
            cost=units*1.5;
            System.out.println("Bill: "+cost);
        }
        
    }
}