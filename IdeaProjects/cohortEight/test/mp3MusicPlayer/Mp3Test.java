package mp3MusicPlayer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mp3Test {

    @Test
    public void mp3Test(){
        Mp3 mp3 = new Mp3();
        assertFalse(mp3.isPowerOn());
        System.out.printf("Get me Mp3 state %s%n", mp3.isPowerOn());
    }

    @Test
    public void onMp3Test(){
        Mp3 mp3 = new Mp3();
        mp3.isPowerOn();

        assertTrue(mp3.turnOn());
        System.out.printf("Get me Mp3 state %s%n", mp3.turnOn());
    }


    @Test
    public void mp3CanPlaySong(){
        Mp3 mp3 = new Mp3();
        mp3.turnOn();
        mp3.setSong(12, "The way of the King", "Brandon Sanders");

        assertEquals(12, mp3.getId());
        System.out.printf("Show me the song id: %s%n", mp3.getId(), mp3.getTitle(), mp3.getArtist());
        assertEquals("Brandon Sanders", mp3.getArtist());
        System.out.printf("The music artist is %s%n  And title: %s%n", mp3.getArtist(), mp3.getTitle());
    }


//    @Test
//    public void mp3Can
//

}

