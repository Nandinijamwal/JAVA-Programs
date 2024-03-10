//accept number and operators and calculate the result according to user's choice
import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner (System.in);
        System.out.println("Enter first number: ");
        int num1=ob.nextInt();
        System.out.println("Enter Second number: ");
        int num2=ob.nextInt();
        System.out.println("select operation: +\n-\n*\n/");
        String op=ob.next();
        int res=0;
        switch(op)
        {
            case "+":
            {
                res=num1+num2;
                System.out.println("Result: "+res);
                break;
            }
            case "-":
            {
                res=num1-num2;
                System.out.println("Result: "+res);
                break;
            }
            case "*":
            {
                res=num1*num2;
                System.out.println("Result: "+res);
                break;
            }
            case "/":
            {
                res=num1/num2;
                System.out.println("Result: "+res);
                break;
            }
            default:
            {
                System.out.println("Invalid choice!!");
            }
        }
    }
}