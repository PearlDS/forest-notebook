package be.intecbrussel.notebook.entities.plant_entities;

public class Flower extends Plant {

    private Scent smell;


    public Flower(String name) {
        super(name);
    }

    public Flower(double height) {
        super(height);
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return getName() + " Flower{" +
                "smell=" + smell +
                '}';
    }
}
