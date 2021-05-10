package media.disc;
import media.*;

public class DigitalVideoDisc extends Media {

    private String trackList;
    private String director;
    private Float length;

    public DigitalVideoDisc(int id, String title, String category, Float cost, String director, String trackList, Float length) {
        super(id, title, category, cost);
        this.trackList = trackList;
        this.director = director;
        this.length = length;
    }
    
    public String getTrackList() {
        return trackList;
    }

    public String getDirector() {
        return director;
    }

    public Float getLength() {
        return length;
    }
}