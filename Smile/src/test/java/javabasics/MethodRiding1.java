package javabasics;

public class MethodRiding1 extends MethodRiding2 {

    public static void main(String[] args) {
        MethodRiding2 r1 = new MethodRiding2();
        r1.m();
    }
    public void m(){

        System.out.println("hello");
    }
}
