package javabasics;

public class StaticExample {

    static int a = 20;
    public void m1(){

        System.out.println(a);
        System.out.println("non static");
    }

    public static void m2(){

        System.out.println(a);
        System.out.println("static");
    }
}
