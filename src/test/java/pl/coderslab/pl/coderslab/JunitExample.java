package pl.coderslab.pl.coderslab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class JunitExample {
    @Test
    public void firstTest(){
        System.out.println("ala ma kota");
    }
    @Disabled
    @Test
    public void secondTest(){
        System.out.println("second Test");
    }

    @BeforeEach
    @Test
    public void beforeEach(){
        System.out.println( "this will be run before each test");

    }

}

