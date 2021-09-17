package com.Bridgelabz;

import java.util.Scanner;

public class LinkedlistMain {
    public static void main(String[] args) {
        System.out.println("Welcome to linkedList Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start");
        switch(scanner.nextInt()){
            case 1:
                Operation.addDataAtStart();
        }
    }
}
