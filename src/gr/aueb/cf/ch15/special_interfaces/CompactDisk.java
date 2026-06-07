package gr.aueb.cf.ch15.special_interfaces;

public class CompactDisk implements IProduct {
    private int id;
    private String title;
    private String description;
    private String capacity;

    public CompactDisk() {

    }

    public CompactDisk(int id, String title, String description, String capacity) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
