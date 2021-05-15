package media.disc;

import java.util.ArrayList;

public class CompactDisc extends Disc {

    private String artist;
    
    public CompactDisc (int id, String title, String category, String director, String artist,Float length, Float cost) {
        super(id, title, category, director, length, cost);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
}