package com.techelevator;

import org.junit.Test;

import org.junit.Assert;

public class NonStartTests {

    NonStart nonstart = new NonStart();

    @Test
    public void testing_Hello_There_String(){
        Assert.assertEquals("This should say ellohere", "ellohere", nonstart.getPartialString("Hello", "There"));
    }

    @Test
    public void testing_java_code_String(){
        Assert.assertEquals("This should say avaode", "avaode", nonstart.getPartialString("java", "code"));
    }

    @Test
    public void testing_shotl_java_String(){
        Assert.assertEquals("This should say hotlava", "hotlava", nonstart.getPartialString("shotl", "java"));
    }

    @Test
    public void test_for_blankString() {
        Assert.assertEquals("Incorrect String returned from getPartialString", "", nonstart.getPartialString(" ", " "));
    }

}
