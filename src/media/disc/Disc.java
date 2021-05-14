package media.disc;

import media.*;

public class Disc extends Media {
    protected String director;
    protected Float length;


    public Disc(int id, String title, String category, String director,Float length, Float cost) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public Float getLength() {
        return length;
    }

    
}
