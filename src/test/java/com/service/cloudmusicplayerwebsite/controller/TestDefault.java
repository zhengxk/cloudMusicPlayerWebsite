package com.service.cloudmusicplayerwebsite.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDefault {

        DefaultDelegate defaultDelegate = new DefaultDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = defaultDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}