/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickchat;


class Login {
    static String regUsername = "";
    static String regPassword = "";
    static String regCellphone = "";
    static String regFirstname = "";
    static String regLastname = "";
    
     // ========== CHECK USERNAME METHODS ==========
    static boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }
    
    // ========== CHECK PASSWORD METHODS ==========
    static boolean checkPasswordComplexity(String password) {
        if(password.length() < 8) return false;
        if(password.equals(password.toLowerCase())) return false;
        if(!password.matches(".*[!@#$%^&*()_+].*")) return false;
        if(!password.matches(".*\\d.*")) return false;
        return true;
    }
    
    // ========== CHECK CELLPHONE METHODS ==========
    static boolean checkCellPhoneNumber(String cellphone) {
        if(cellphone.startsWith("+27") && cellphone.length() == 12) {
            String number = cellphone.substring(3);
            if(number.matches("\\d+")) {
                return true;
            }
        }
        return false;
    }
    
    // ========== REGISTER USER METHODS ==========
    static String registerUser(String firstname, String lastname, String username, String password, String cellphone) {
        String error = "";
        
        if(!checkUserName(username)) {
            error += "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters length.\n";
        }
        if(!checkPasswordComplexity(password)) {
            error += "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number and a special character.\n";
        }
        if(!checkCellPhoneNumber(cellphone)) {
            error += "Cellphone is not correctly formatted or does not contain international code.\n";
        }
        
        if(!error.isEmpty()) {
            return error;
        }
        
        regUsername = username;
        regPassword = password;
        regFirstname = firstname;
        regLastname = lastname;
        regCellphone = cellphone;
        
        return "Username successfully captured\nPassword successfully captured\nCellphone successfully captured\nWelcome " + firstname + " " + lastname + " it is great to see you.";
    }
}
