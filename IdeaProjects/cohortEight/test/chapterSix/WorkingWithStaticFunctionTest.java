package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkingWithStaticFunctionTest {

    @Test
    public void calculateTwoNumbers() {
        WorkingWithStaticFunction add = new WorkingWithStaticFunction();
        assertEquals(15, add.additionOfTwoNumbers(7, 8));
    }


    @Test
    public void canMultiplyTwoNumbers(){
    }

    @Test
    public void canGetInstanceOfNumber(){
        WorkingWithStaticFunction shola = new WorkingWithStaticFunction();
    }
}