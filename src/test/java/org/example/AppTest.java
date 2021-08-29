package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void checkCorrectEmail()
    {
        String email = "olia.sapon@gmail.com";
        assertEquals(email, "olia.sapon@gmail.com");
    }

    @Test
    public void checkNotCorrectEmail()
    {
        String email = "olia.sapon@gmail.com";
        assertNotEquals(email, "test1@gmail.com");
    }
}