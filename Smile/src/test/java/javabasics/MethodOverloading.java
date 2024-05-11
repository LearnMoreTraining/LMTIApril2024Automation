package javabasics;

public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading ol = new MethodOverloading();
        ol.m(34,"lmti");
    }
    public void m(int a){
        System.out.println(a);
    }

    public void m(String b){
        System.out.println(b);
    }

    public void m(int a , int b){
        System.out.println(a);
        System.out.println(b);
    }

    public void m(int a , String b){
        System.out.println(a);
        System.out.println(b);
    }
}
