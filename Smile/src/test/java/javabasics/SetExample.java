package javabasics;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> s = new HashSet<Integer>();
        s.add(45);
        s.add(67);
        System.out.println(s);
        s.add(45);
        s.add(89);
        System.out.println(s);

        for(int d:s){
            System.out.println(d);
        }


    }
}
