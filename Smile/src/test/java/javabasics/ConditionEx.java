package javabasics;

public class ConditionEx {

    public static void main(String[] args) {

        int a = 20 ;

        if( a > 0 && a <=5 ){

            System.out.println(a * 2);
        }
        else if(a > 5 && a<= 10){

            System.out.println(a * 3);
        }
        else if(a > 10 && a<= 20){

            System.out.println(a * 4);
        }
        else{

            System.out.println(a * 5);
        }

    }

}
