package media;

public class Media {
    
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
}
