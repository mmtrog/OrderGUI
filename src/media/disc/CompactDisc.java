package media.disc;

import java.util.ArrayList;

public class CompactDisc extends Disc {

    private String artist;
    private String trackList;
    
    public CompactDisc (int id, String title, String category, String director, String artist,Float length, Float cost, String trackList) {
        super(id, title, category, director, length, cost);
        this.artist = artist;
        this.trackList = trackList;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public Float getLength() {
        return length;
    }
}