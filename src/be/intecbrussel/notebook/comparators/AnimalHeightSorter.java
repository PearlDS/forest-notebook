package be.intecbrussel.notebook.comparators;
import be.intecbrussel.notebook.entities.animal_entities.Animal;
import java.util.Comparator;

public class AnimalHeightSorter implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return Double.compare(o2.getHeight(), o1.getHeight());
    }
}
