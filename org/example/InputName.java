package org.example;

import java.util.Scanner;

public class InputName {
//    private String name;
//
//    public InputName(String name) {
//        this.name = name;
//    }

    public String inName(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a name: ");
        String name = in.next();
        in.close();
        return name;
    }
}
