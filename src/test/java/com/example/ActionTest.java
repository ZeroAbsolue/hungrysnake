package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;    
    
public class ActionTest {

        
    @Test
    public void test() {
       assertEquals("AUCUN", Action.AUCUN.name()); 
    }
}
    