package tvAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvSetTest {

        @Test
        public void televisionTest(){
            TvSet myTv = new TvSet();
            myTv.tvName("Nuendo");

            assertEquals("Nuendo", myTv.getTvName());
            assertEquals(false, myTv.tvPower(false));
//            assertFalse(false, myTv.tvMode(false));
            System.out.printf("My Tv name is %s%n and the mode is %s%n", myTv.getTvName(), myTv.tvPower(false));
        }

        @Test
        public void onMyTvSetTest(){
            TvSet myTv = new TvSet();
            myTv.tvName("Nuendo");

            assertEquals(true, myTv.tvIsOn(true, 2, 10));
            System.out.printf("My Tv name is %s%n, the mode was %s%n and isTvOn is %s%n", myTv.getTvName(), myTv.tvPower(true), myTv.tvIsOn(true, 0, 10));
        }

        @Test
        public void myTvChannelTest(){
            TvSet myTv = new TvSet();
            myTv.tvName("Nuendo");
            myTv.tvIsOn(true, 0, 10);
            myTv.myTvChannel(0);
//            myTv.displayChannels();

            assertEquals(0, myTv.getMyChannel());
            System.out.printf("My Tv name is %s%n and the channel is %s%n", myTv.getTvName(), myTv.getMyChannel());
        }


    @Test
        public void changeMyTvChannelTest(){
        TvSet myTv = new TvSet();
        myTv.tvIsOn(true, 0, 10);
        myTv.changeChannel(2);
        if (myTv.tvIsOn(true,0,2)) {
            int i = 0;
            while (i < 30)
                myTv.changeChannel(1);
        }
        assertEquals(100, myTv.getChangeChannel());
    }


        @Test
        public void changeMyTvVolumeTest(){
            TvSet myTv = new TvSet();
            myTv.tvIsOn(true, 0, 10);
            myTv.changeVolume(2);
            if (myTv.tvIsOn(true,0,2)) {
                int i =0;
                while ( i < 30 )
                    myTv.changeVolume(i++);
            }
            assertEquals(30, myTv.getChangeVolume());
            System.out.printf("My Tv name is %s%n and the channel is", myTv.getChangeVolume());
        }
}

// if(tv.IsOn())
//         {
//         while(i<5)
//        tv.changeChannel(i++);
//        tv.changeVolume(x);
//        }

//
//
//    Search Method:
//    Volumes punch through:
//        Master reset:
//        RealTime Macro: (to assign all off/on functions to PWR button)
//
//
//
////defining attributes