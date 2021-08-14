package assignmentChapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirCondtionTest {

    //To get The name of My AirCondition
    @Test
    public void AirCondtition(){
        AirCondtion myAirCondition = new AirCondtion();
        myAirCondition.nameOfMyAirCondition("AutoConAc", 16,17,16);

        assertEquals("AutoConAc", myAirCondition.getNameOfMyAirCondition());
    }



    //To Put On myAirCondititon
    @Test
    public void onAirConditon(){
        AirCondtion myAirCondition = new AirCondtion();
        myAirCondition.checkOff();

        assertEquals(true, myAirCondition.onMyAirCondition(true, 16));
    }

    //To get Temperature == currentTemp
    @Test
    public void getCurrentTemperature(){
        AirCondtion myAirCondition = new AirCondtion();

        myAirCondition.onMyAirCondition(true,16);
        myAirCondition.setCurrentTemperature(67);

        assertEquals(30, myAirCondition.getCurrentTemperature());
    }


    //Increase In CurrentTemp
    //THis is Super-Working
    @Test
    public void increaseTempAndWhenTempIsAbove30xapkq(){
        AirCondtion myAirCondition = new AirCondtion();

        myAirCondition.onMyAirCondition(true,16);
        myAirCondition.setCurrentTemperature(31);


        assertEquals(31, myAirCondition.getIncreaseAirCondition());
    }

//    Decrease in Temperature. ==>THis is perfect. Although you Can put all these in One Metho
//    This is Super-Working
    @Test
    public void decreaseTempertureAnd(){
        AirCondtion myAirCondition = new AirCondtion();

        myAirCondition.onMyAirCondition(true,1);
        myAirCondition.setCurrentTemperature(14);

        assertEquals(14, myAirCondition.getDecreaseAirCondition());
    }


//    Switch Off my AirCondition

    @Test
    public void offAirCondititon(){
        AirCondtion myAirCondition = new AirCondtion();
        myAirCondition.onMyAirCondition(true, 16);

//        myAirCondition.putOffmyAirCondition(false);

//        assertEquals(false, myAirCondition.onMyAirCondition(false));
        assertEquals(false, myAirCondition.putOffmyAirCondition(false));
    }

}

