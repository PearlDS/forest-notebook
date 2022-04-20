package be.intecbrussel.notebook.entities.plant_entities;

public class Tree extends Plant {

    private LeafType leafType;

    public Tree(String name) {
        super(name);
    }

    public Tree(double height) {
        super(height);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "leafType=" + leafType +
                '}';
    }
}
