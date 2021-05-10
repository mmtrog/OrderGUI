package media.disc;

public class Track {
    private String title;
    private int length;
    private String artist;

    public Track(String title, int length, String artist) {
        this.title = title;
        this.length = length;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }    

    public String getArtist() {
        return artist;
    }
}
