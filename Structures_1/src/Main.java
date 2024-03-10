import java.lang.System;
//import java.util.*;
class Add{
    int a,b,c;
    public void input(int x, int y){
        a=x;
        b=y;
    }
    public void res(){
        c=a+b;
        System.out.println("c is "+c);
    }
}

public class Main {
    public static void main(String[] args) {
        Add m= new Add();
        m.input(10,20);
        m.res();
    }
}