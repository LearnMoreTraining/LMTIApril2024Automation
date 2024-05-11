package javabasics;

public class VaraiablesExample {

    int c = 20 ; //Global variable
    int d ;  //global variable //null value
    public void m1(){
        d =10 ;
        int a = 1; //local variable
        System.out.println(a);
        System.out.println(c);
    }

    public void m2(){
        int b= 3;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}
