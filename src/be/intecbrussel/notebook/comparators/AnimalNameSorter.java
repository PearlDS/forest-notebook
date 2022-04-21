package be.intecbrussel.notebook.comparators;
import be.intecbrussel.notebook.entities.animal_entities.Animal;
import java.util.Comparator;

public class AnimalNameSorter implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
