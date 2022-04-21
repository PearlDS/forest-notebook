package be.intecbrussel.notebook.comparators;
import be.intecbrussel.notebook.entities.plant_entities.Plant;
import java.util.Comparator;

public class PlantHeightSorter implements Comparator<Plant> {
    @Override
    public int compare(Plant o1, Plant o2) {
        return Double.compare(o2.getHeight(), o1.getHeight());
    }
}
