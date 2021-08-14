package automaticBike;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {

    // My Bike Name
    @Test
    public void myBikeBrandTest() {
        AutomaticBike myBike = new AutomaticBike();
        myBike.bikeName("Abiko");
        assertEquals("Abiko", myBike.getBikeName());
    }

    // Automotatic Bike Mode
    @Test
    public void bikeIsOffTest() {
        AutomaticBike myBike = new AutomaticBike();
        assertFalse(myBike.isPowerOn());
        System.out.printf("The state of my Bike is : %s%n", myBike.isPowerOn());
    }

    //Method to Put On My MyBike
    @Test
    public void bikeIsOnTest() {
        AutomaticBike myBike = new AutomaticBike();
        myBike.powerBike(true);

        assertTrue(myBike.isPowerOn());

        System.out.printf("The state of my Bike is : %s%n", myBike.isPowerOn());
    }


    @Test
    public void authenticateMyBikeTest() {
        AutomaticBike myBike = new AutomaticBike();
        myBike.powerBike(true);


        myBike.authenticateMyBike("@378XS");
        assertEquals("@378XS", myBike.getPassword("@378XS"));
//        assertEquals(true, myBike.getPassword(thePassword));
    }

    @Test
    public void bikeCanAccelerateByGearOneTest() {
        AutomaticBike myBike = new AutomaticBike();
        myBike.powerBike(true);
        assertEquals(0, myBike.getCurrentSpeed());

        for (int i = 1; i <= 21; i++) {
            myBike.increaseCurrentSpeed();
        }

//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();


        assertEquals(21, myBike.getCurrentSpeed());
        System.out.printf("the current value : %s%n", myBike.getCurrentSpeed());

        //todo test that the can accelerate when the bike is Off
    }


    @Test
    public void test_Score(){
        int sum = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("supply the scores: ");
        int score = input.nextInt();
        for (int i = 0; i <= 50 ; i++) {
            sum = sum + score;
        }

    }


    @Test
    public void getBikeAccelerateByGearOneTest() {
        AutomaticBike myBike = new AutomaticBike();
        myBike.powerBike(true);


//        for (int i = 1; i <= 21; i++){ myBike.increaseCurrentSpeed(); }

        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();


        assertEquals(2, myBike.getGearOne());
        System.out.printf("The value of gear is: %s%n", myBike.getGearOne());
    }


    @Test
    public void bikeCanAccelerateByGearTwoTest() {
        AutomaticBike myBike = new AutomaticBike();
        myBike.powerBike(true);

        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();


        assertEquals(26, myBike.getCurrentSpeed());
        System.out.printf("Get my current Speed: %s%n", myBike.getCurrentSpeed());
    }


    @Test
    public void getBikeAccelerateByGearTwoTest() {
        AutomaticBike myBike = new AutomaticBike();
           myBike.powerBike(true);


    //        for (int i = 1; i <= 21; i++){ myBike.increaseCurrentSpeed(); }

       myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();


        assertEquals(2,myBike.getGearTwo());
        System.out.printf("The value of gear is: %s%n", myBike.getGearOne());

}
    @Test
    public void bikeCanAccelerateByGearThreeTest() {
        AutomaticBike myBike = new AutomaticBike();
        myBike.powerBike(true);

        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();



        assertEquals(3, myBike.getCurrentSpeed());
    }


    @Test
    public void getBikeAccelerateByGearThreeTest(){
        AutomaticBike myBike = new AutomaticBike();
        myBike.powerBike(true);

        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();


        assertEquals(3, myBike.getGearThree());
    }


    /*
    if condition must finish the first if THE FOLLOW BY THE NEXT ONE AND FOLLOW
     BY  THE NEXT ONE UNTIL THE CONDITIONS ARE SATIFIED. THE (if will not jump or exit except theORDER)
     of your conditons are true
     */

    @Test
    public void bikeCanAccelerateByGearFourTest(){
        AutomaticBike myBike = new AutomaticBike();
        myBike.isPowerOn();

        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();

        assertEquals(40, myBike.getCurrentSpeed());
    }


    @Test
    public void getBikeAccelerateByGearFour(){
        AutomaticBike myBike = new AutomaticBike();
        myBike.isPowerOn();

        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();


        assertEquals(4, myBike.getGearFour());
    }



    @Test
    public void bikeCanDecelerateByGearOneTest(){
        AutomaticBike myBike = new AutomaticBike();
        myBike.powerBike(true);

        for (int i =1; i < 21; i++){
            myBike.increaseCurrentSpeed();
        }

        //EITHER OF THESE SHOULD WORK

//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();


       //assertEquals(20, myBike.getCurrentSpeed());

        myBike.decreaseCurrentSpeed();

        assertEquals(19, myBike.getCurrentSpeed());
    }


    @Test
    public void getBikeDecelerateByGearOneTest(){
        AutomaticBike myBike = new AutomaticBike();
        myBike.powerBike(true);

        for (int i =1; i < 21; i++){
            myBike.increaseCurrentSpeed();
        }

//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//        myBike.increaseCurrentSpeed();
//



        myBike.decreaseCurrentSpeed();
        myBike.decreaseCurrentSpeed();
        myBike.decreaseCurrentSpeed();


        assertEquals(1, myBike.getGearOne());
        System.out.printf("get current gear: %s%n", myBike.getGearOne());
    }


    @Test
    public void bikeCanDecelerateByGearTwoTest(){

        AutomaticBike myBike = new AutomaticBike();
        myBike.powerBike(true);

        for (int i =1; i < 21; i++){
            myBike.increaseCurrentSpeed();
        }

        //EITHER OF THESE SHOULD WORK

        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();



        //assertEquals(20, myBike.getCurrentSpeed());

        myBike.decreaseCurrentSpeed();
        myBike.decreaseCurrentSpeed();
        myBike.decreaseCurrentSpeed();



        assertEquals(52, myBike.getCurrentSpeed());
    }




    @Test
    public void getBikeDecelerateByGearTwoTest(){
        AutomaticBike myBike = new AutomaticBike();
        myBike.powerBike(true);

//        for (int i =1; i < 21; i++){
//            myBike.increaseCurrentSpeed();
//        }

        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();
        myBike.increaseCurrentSpeed();






        myBike.decreaseCurrentSpeed();
        myBike.decreaseCurrentSpeed();
        myBike.decreaseCurrentSpeed();
        myBike.decreaseCurrentSpeed();
        myBike.decreaseCurrentSpeed();
        myBike.decreaseCurrentSpeed();
        myBike.decreaseCurrentSpeed();
        myBike.decreaseCurrentSpeed();
        myBike.decreaseCurrentSpeed();
        myBike.decreaseCurrentSpeed();
        myBike.decreaseCurrentSpeed();



        assertEquals(1, myBike.getGearTwo());
        System.out.printf("get current gear: %s%n", myBike.getGearTwo());
    }





}


