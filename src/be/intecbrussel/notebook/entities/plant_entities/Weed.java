package be.intecbrussel.notebook.entities.plant_entities;

public class Weed extends Plant {

    private double area;

    public Weed(String name) {
        super(name);
    }

    public Weed(double height) {
        super(height);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return getName()+ " Weed{" +
                "area=" + area +
                '}';
    }
}
