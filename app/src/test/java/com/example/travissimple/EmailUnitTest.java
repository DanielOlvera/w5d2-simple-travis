package com.example.travissimple;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Daniel on 11/16/16.
 */

public class EmailUnitTest {
    @Test
    public void obfuscates_shortEmails()throws Exception{
        EmailObfuscator emailObfuscator = new EmailObfuscator();
        //emailObfuscator.obfuscate("a@gmail.com");
        assertEquals(emailObfuscator.obfuscate("a@gmail.com"), "a***@gmail.com");
        assertEquals(emailObfuscator.obfuscate("aa@gmail.com"), "a***@gmail.com");
        assertEquals(emailObfuscator.obfuscate("aaa@gmail.com"), "a***@gmail.com");

        assertNotEquals(emailObfuscator.obfuscate("aaa@gmail.com"), "a***@gmail.com");
    }

    @Test
    public void obfuscates_longEmails() throws Exception{
        EmailObfuscator emailObfuscator = new EmailObfuscator();
        assertEquals(emailObfuscator.obfuscate("abcd@gmail.com"), "a***@gmail.com");
        assertEquals(emailObfuscator.obfuscate("abcdefg@gmail.com"), "a***@gmail.com");
        assertEquals(emailObfuscator.obfuscate("abcdefghijzxcasd@gmail.com"), "a***d@gmail.com");
    }

}
