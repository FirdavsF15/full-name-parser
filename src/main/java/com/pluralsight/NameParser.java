package com.pluralsight;

import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

        String[] nameParts = fullName.split(" ");

        String firstName, middleName = "none", lastName;

        firstName = nameParts[0];
        if(nameParts[1].length() <=2){
            middleName = nameParts[1];
            lastName = nameParts[2];
        }else{
            lastName = nameParts[1];
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

    }
}
