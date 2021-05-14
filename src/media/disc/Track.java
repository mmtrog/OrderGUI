package media.disc;

public class Track implements Playable {
    private String title;
    private Float length;

    public Track(String title, Float length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public Float getLength() {
        return length;
    }
   
    @Override
    public void play() throws PlayerException{
        if (this.getLength() > 0) {
            System.out.println("Playing Track: " + this.getTitle());
            System.out.println("Track length: " + this.getLength());
        } 
        else {
            throw new PlayerException("ERROR: Track " + this.getTitle() + " length error!!!");
        }
    }

}
