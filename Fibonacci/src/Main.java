import java.lang.System;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Fibonacci series: ");
        int a =0, b=1;
        for (int i=0;i<num;i++)
        {
            System.out.println(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
    }