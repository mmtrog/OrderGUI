package media;

public class Media implements Comparable<Object> {
    
    protected String title;
    protected String category;
    protected Float cost;
    protected int id;
    
    public Media(int id,String title, String category, Float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id; 
    }
    
    //********************************* Getter methods **********************************
    
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
   
    public String getCategory() {
        return category;
    }
   
    public Float getCost() {
        return cost;
    }
    
    //********************************* Override equals methods **********************************

    @Override
    public boolean equals(Object o) {
        if (o instanceof Media) {
            Media media = (Media) o;
            return media.getId() == this.id;
        }
        return false;
    }

    //********************************* Override Sort method **********************************

    @Override
    public int compareTo(Object o) {
        if (o instanceof Media) {
            Media media = (Media) o;
            return this.cost.compareTo(media.getCost());                 
        }
        return 1;
    }
}
