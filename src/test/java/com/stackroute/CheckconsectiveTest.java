package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckconsectiveTest {
    Checkconsective obj;

    @Test
    public void checkConsective() {
        assertEquals("98,96,95,94,93 non consecutive numbers", obj.checkConsective(" 98,96,95,94,93"));
    }

        @Test
        public void checkConsective1() {
            assertEquals("54,53,52,51,50,49,48 are consecutive numbers", obj.checkConsective("54,53,52,51,50,49,48"));
        }

            @Test
    public void checkConsective2(){
        assertEquals("1,2,3,4,5,6,6 non consecutive numbers" , obj.checkConsective("1,2,3,4,5,6,6"));

    }

}