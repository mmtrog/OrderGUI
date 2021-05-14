package media.disc;
public class DigitalVideoDisc extends Disc implements Playable{

    public DigitalVideoDisc(int id, String title, String category, String director,Float length, Float cost) {
        super(id, title, category, director, length, cost);
    }

    @Override
    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        } 
        else {
            throw new PlayerException("ERROR: DVD " + this.getTitle() + " length error!!!");
        }
    }
    
    
}