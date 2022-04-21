package be.intecbrussel.notebook.comparators;
import be.intecbrussel.notebook.entities.plant_entities.Plant;

import java.util.Comparator;

public class PlantNameSorter implements Comparator<Plant> {
    @Override
    public int compare(Plant o1, Plant o2) {
       return o1.getName().compareTo(o2.getName());
    }
}
