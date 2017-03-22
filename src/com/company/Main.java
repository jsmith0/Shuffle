package com.company;

import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner w = new Scanner(new File("class.txt"));

        List<String> before = new ArrayList<String>();
        List<String> after = new ArrayList<String>();

        while (w.hasNext()){
            before.add(w.next());
        }
        w.close();

        while (before.size() > 0){
            int rand = (int)(Math.random()*before.size());
            after.add((before.get(rand)));
            before.remove(rand);
        }
        System.out.println(after);



    }
}
