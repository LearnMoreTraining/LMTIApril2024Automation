package javabasics;

public class ConditionExamples {

    public static void main(String[] args) {

        int a = 200;
        int b = 30;

        if(a > b){
            System.out.println(a * 2);
        }
        else{
            System.out.println(b * 3);
        }

        String name = "abc";
        String sample = "abc";

        if( name.equals(sample)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

    }
}
