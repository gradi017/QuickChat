/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.quickchat;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
public class JunitTest {
    

    // ========== TESTS USERNAME ==========
    @Test
    public void testCheckUserNameCorrect() {
        Assert.assertEquals(true, Login.checkUserName("kyl_1"));
    }
    
    @Test
    public void testCheckUserNameIncorrect() {
        Assert.assertEquals(false, Login.checkUserName("kyle!!!!!!!"));
    }
    
    // ========== TESTS PASSWORD ==========
    @Test
    public void testCheckPasswordComplexityCorrect() {
        Assert.assertEquals(true, Login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }
    
    @Test
    public void testCheckPasswordComplexityIncorrect() {
        Assert.assertEquals(false, Login.checkPasswordComplexity("password"));
    }
    
    // ========== TESTS CELLPHONE ==========
    @Test
    public void testCheckCellPhoneNumberCorrect() {
        Assert.assertEquals(true, Login.checkCellPhoneNumber("+27838968976"));
    }
    
    @Test
    public void testCheckCellPhoneNumberIncorrect() {
        Assert.assertEquals(false, Login.checkCellPhoneNumber("08966553"));
    }
    
    // ========== TESTS LOGIN ==========
    @Test
    public void testLoginSuccessful() {
        Login.registerUser("Gradi", "zed", "kyl_1", "Ch&&sec@ke99!", "+27838968976");
        Assert.assertEquals(true, Login.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }
    
    @Test
    public void testLoginFailed() {
        Login.registerUser("Gradi", "zed", "kyl_1", "Ch&&sec@ke99!", "+27838968976");
        Assert.assertEquals(false, Login.loginUser("wrong_username", "wrong_password"));
    }
    
    // ========== TESTS REGISTER ==========
    @Test
    public void testRegisterUserWelcome() {
        String result = Login.registerUser("Gradi", "zed", "kyl_1", "Ch&&sec@ke99!", "+27838968976");
        Assert.assertEquals(true, result.contains("Welcome Gradi zed it is great to see you."));
    }
    
    @Test
    public void testRegisterUserBadUsernameError() {
        String result = Login.registerUser("Gradi", "zed", "kyle!!!!!!!", "Ch&&sec@ke99!", "+27838968976");
        Assert.assertEquals(true, result.contains("Username is not correctly formatted"));
    }
}
