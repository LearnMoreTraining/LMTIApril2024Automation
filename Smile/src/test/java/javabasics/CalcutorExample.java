package javabasics;

public class CalcutorExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 0 ;

        String operator = "/";

        if(operator.equals("+")){

            System.out.println(a + b);
        }
        else if (operator.equals("-")){

            if(a > b){
                System.out.println(a - b);
            }
            else{
                System.out.println(b - a);
            }
        }
        else if (operator.equals("*")){

            System.out.println(a * b);
        }
        else if (operator.equals("/")){

           if( a == 0 || b == 0){
               System.out.println("enter non zero number");
           }
           else{
               System.out.println(a/b);
           }
        }
        else{
            System.out.println("enter the valid operator");
        }

    }
}
