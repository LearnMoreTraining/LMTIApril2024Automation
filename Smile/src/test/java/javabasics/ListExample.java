package javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(45); //0
        l.add(56); //1
        System.out.println(l);
        l.add(78); //2
        System.out.println(l);
        l.add(78);
        l.add(56);
        l.add(2,67);
        System.out.println(l);

        for(int h:l){
            System.out.println(h);
        }

        String [] k = {"lmti","learnmore"};

        for(String v:k){
            System.out.println(v);
        }

        List <String> l1 = new ArrayList<String>();
        l1.add("lmti");
        l1.add("learn");
        l1.add("more");

        for(String o:l1){
            System.out.println(o);
        }

    }
}
