package chapterFive;

import jdk.dynalink.NamedOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDrillerTest {

    int result;

    @Test
    public void calculateCopyOfBooksFromOneToFourTest(){

        TestDriller testDriller = new TestDriller();
        result = testDriller.calculatePrice(5);
        assertEquals(6000, result);
    }

    @Test
    public void calculateCopyOfBooksFromFiveToNineTest(){

        TestDriller testDriller = new TestDriller();
        result = testDriller.calculatePrice(6);
        assertEquals(8400, result);
    }



    @Test
    public void calculateCopyOfBooksFromTenToTwentyNineTest(){

        TestDriller testDriller = new TestDriller();
        result = testDriller.calculatePrice(6);
        assertEquals(8400, result);
    }


    @Test
    public void calculateCopyOfBooksFromThirtyToFortyNineTest(){

        TestDriller testDriller = new TestDriller();
        result = testDriller.calculatePrice(6);
        assertEquals(8400, result);
    }

    @Test
    public void calculateCopyOfBooksFromFiftyToNinetyNineTest(){

        TestDriller testDriller = new TestDriller();
        result = testDriller.calculatePrice(6);
        assertEquals(8400, result);
    }

    @Test
    public void calculateCopyOfBooksFromHundredToHundredAndNinetyNineTest(){

        TestDriller testDriller = new TestDriller();
        result = testDriller.calculatePrice(88);
        assertEquals(88000, result);
    }

    @Test
    public void calculateCopyOfBooksFromTwoHundredAndAboveTest(){

        TestDriller testDriller = new TestDriller();
        result = testDriller.calculatePrice(200);
        assertEquals(160000, result);
    }
}