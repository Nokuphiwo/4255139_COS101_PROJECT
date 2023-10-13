package myfirstprogram;
//Author: Nokuphiwo Bhubesi
//Student Number: 4255139
//Project Name: Mobile Banking Application

import java.util.Scanner;

public class BankingApp_Prototype_4255139 {

 public static void main(String[] args) {
     System.out.println("Welcome to My Java Prototype for SNP Bank mobile banking application");
     System.out.println("This is the banking application registration");

     // User registration information capturing
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter your first name to register: ");
     String firstName = scanner.nextLine();

     System.out.print("Enter your last name: ");
     String lastName = scanner.nextLine();
     
     System.out.print("Enter your user name, any name you choose for yourself");
     String userName= scanner.nextLine();
     
     System.out.print("Enter your email address: ");
     String email = scanner.nextLine();
     
     System.out.print("Enter your password");
     String password= scanner.nextLine();
     
     System.out.print("Confirm your password: ");
     String confirmPassword = scanner.nextLine();
     
     if (password.equals(confirmPassword)) {
     System.out.println("\nUser Registration Successful! Welcome to SNP Bank");
     System.out.println("Name and surname: " + firstName + " " + lastName);
     System.out.println("User name: " + userName);
     System.out.println("User email:" + email);
     System.out.println("User password: "+ password);}
     
     else {
         System.out.println("Password and confirmation do not match. Registration failed.");
     }
     
     scanner.close();
 }
}
