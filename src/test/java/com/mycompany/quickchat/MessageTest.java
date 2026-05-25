/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package com.mycompany.quickchat;

import org.junit.Test;
import org.junit.Assert;

public class MessageTest {
    
    
    @Test
    public void testMessageLengthSuccess() {
        Message msg = new Message(1, "+27718693002", "Hi Mike, can you join us for dinner tonight?");
        Assert.assertEquals(true, msg.checkMessageLength());
    }
    
    
    @Test
    public void testMessageLengthFailure() {
        String longMessage = "This is a very long message that goes on and on. ".repeat(20);
        Message msg = new Message(1, "+27718693002", longMessage);
        Assert.assertEquals(false, msg.checkMessageLength());
    }
   
    
    @Test
    public void testRecipientCellSuccess() {
        Message msg = new Message(1, "+27718693002", "Hello");
        String result = msg.checkRecipientCell();
        Assert.assertEquals("Cell phone number successfully captured.", result);
    }
    
    
    @Test
    public void testRecipientCellFailure() {
        Message msg = new Message(1, "08575975889", "Hello");
        String result = msg.checkRecipientCell();
        Assert.assertEquals(true, result.contains("incorrectly formatted"));
    }
}
   
