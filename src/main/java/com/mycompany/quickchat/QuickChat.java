/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quickchat;

import java.util.Scanner;

public class QuickChat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your firstname: ");
        String firstname = scan.next();
        
        System.out.print("Enter your lastname: ");
        String lastname = scan.next();
        
        System.out.print("Enter your username: ");
        String username = scan.next();
        
        System.out.print("Enter your password: ");
        String password = scan.next();
        
        System.out.print("Enter your cellphone: ");
        String cellphone = scan.next();
        
        String result = Login.registerUser(firstname, lastname, username, password, cellphone);
        System.out.println(result);
        
        if(result.contains("is not correctly")) {
            return;
        }
    }
}
