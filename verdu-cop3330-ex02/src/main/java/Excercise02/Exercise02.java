package Excercise02;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise02 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the input string? ");

        String string = scanner.nextLine();
        int num =  string.length();

        System.out.println(string + " has " + num + " characters.");

    }

}
