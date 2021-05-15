package media.disc;

public class Track {
    private String title;
    private Float length;
    private int id;

    public Track(int id, String title, Float length) {
        this.id = id;
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public Float getLength() {
        return length;
    }

    public int getId() {
        return id;
    }
}
