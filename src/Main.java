public class Main{
    public static void main(String[] args) {
        
        MusicBox mbox = new MusicBox("S34TG65", 'Y', "Raindrops", "Misty", 
        "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");

        System.out.println("Now playing the song");
        mbox.playSong(mbox.getSongID(), mbox.getPremiumSong(), 2);
        
        // --- TODO

        /* Repeat the above code to create another object  
         * Pass different parameters to the MusicBox constructor, but initialise premiumSong to N and when calling the
         * playSong method, pass ads parameter as just 1
         * 
         * 
        */
        MusicBox anotherMbox = new MusicBox("X98YZ12", 'N', "Sunshine", "Bright", 
        "On the sunny side", "Pop", "StarTunes", "Harmony Magic");
        
        System.out.println("Now playing another song");
        anotherMbox.playSong(anotherMbox.getSongID(), anotherMbox.getPremiumSong(), 1);
        System.out.println("Now playing another song");

    }
}




