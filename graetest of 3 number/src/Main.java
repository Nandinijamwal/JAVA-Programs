public class Main {
    public static void main(String[] args)
    {
        int a=10;
        int b=90;
        int c=600;
        if (a>b && a>c)
        {
            System.out.println("a is greatest");
        }
        else if (b>a && b>c) {
            System.out.println("b is greatest");
        }
        else {
            System.out.println("c is greatest");
        }
    }
}