import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //CIRCLE
        System.out.println("Enter radius: ");
        float radius= sc.nextFloat();
        double areac = (3.14*radius)*radius;
        System.out.println("Area of circle: "+ areac);
        System.out.println();
      //SQUARE
        System.out.println("Enter side of square: ");
        float side=sc.nextFloat();
        float areas=side*side;
        System.out.println("Area of square: "+ areas);
      //RECTANGLE
        System.out.println("Enter length of rectangle: ");
        float l=sc.nextFloat();
        System.out.println("Enter breadth of rectangle: ");
        float b=sc.nextFloat();
        float arear= l*b;
        System.out.println("Area of rectangle: "+ arear);
    }
}