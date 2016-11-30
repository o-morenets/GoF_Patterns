package creational.prototype;

/**
 * Created by user on 05.11.2014.
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    public String getId() {
        return id;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    protected void draw() {
        System.out.println("Shape");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
