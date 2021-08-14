package chapterFive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    int fac;

    @Test
    public void calculateFactorialTest(){
        Factorial factorial = new Factorial();

        fac = factorial.calculateFactorial();

        assertEquals(6, fac);
    }
    
}