/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Poepart {


    private static String username;
    private static String password;
    private static String verifyPassword;

    public static void main(String[] args) {

        Login objlogin = new Login(); // Instance of Login class
        Scanner input = new Scanner(System.in);

        // Prompt username
        System.out.println("Please enter your username:");
        username = input.nextLine();

        if (objlogin.checkUserName(username)) {
            System.out.println("Thank you for the username.");
        } else {
            System.out.println("The username is incorrectly formatted.");
        }

        // Prompt password
        System.out.println("Please enter your password:");
        password = input.nextLine();

        if (objlogin.checkpassword(password)) {
            System.out.println("Thank you, your password was successfully captured.");
        } else {
            System.out.println("The password is not correctly formatted.");
        }

        // Prompt cellphone number
        System.out.println("Please enter your cellphone number:");
        String cellPhoneNumber = input.nextLine();

        if (objlogin.checknumber(cellPhoneNumber)) {
            System.out.println("Thank you, cellphone number successfully added.");
        } else {
            System.out.println("The cellphone number is incorrectly formatted or missing international code.");
        }

        // Confirm username
        System.out.println("Please confirm the username you used:");
        String confirmUsername = input.nextLine();

        if (objlogin.verifyUsername(confirmUsername, username)) {
            System.out.println("You entered the correct username.");
        } else {
            System.out.println("Incorrect username.");
        }

        // Confirm password
        System.out.println("Please confirm the password you used:");
        verifyPassword = input.nextLine();

        if (objlogin.verifyPassword(verifyPassword, password)) {
            System.out.println("You entered the password correctly.");
        } else {
            System.out.println("Incorrect password.");
        }

        // Confirm cellphone number
        System.out.println("Please confirm the cellphone number you used:");
        String confirmCell = input.nextLine();

        if (objlogin.verifyCellphoneNumber(confirmCell, cellPhoneNumber)) {
            System.out.println("You entered the correct cellphone number.");
        } else {
            System.out.println("Incorrect cellphone number.");
        }

        // User full name
        System.out.println("Enter your first name:");
        String firstName = input.nextLine();

        System.out.println("Enter your last name:");
        String lastName = input.nextLine();

        // Login prompt
        System.out.println("\n========================================== Login =====================================");

        System.out.println("Please enter the username you signed up with:");
        String loginUsername = input.nextLine();

        System.out.println("Please enter the password you signed up with:");
        String loginPassword = input.nextLine();

        if (objlogin.login(loginUsername, loginPassword)) {
            System.out.println("Welcome " + firstName + " " + lastName + ", it is great to see you again.");
        } else {
            System.out.println("Incorrect username or password. Please try again.");
        }

        System.out.println("Please enter the correct cellphone number:");
        String finalCell = input.nextLine();

        if (objlogin.verifyCellphoneNumber(finalCell, cellPhoneNumber)) {
            System.out.println("Correct cellphone number.");
        } else {
            System.out.println("Incorrect cellphone number.");
        }

        // Final login confirmation
        System.out.println("\n***** Final Login Check ****");
        if (objlogin.login(username, password)) {
            System.out.println("Login Successful. Welcome " + username + "!");
        } else {
            System.out.println("Login Unsuccessful. Please try again.");
        }

        input.close();
    }
}

    

