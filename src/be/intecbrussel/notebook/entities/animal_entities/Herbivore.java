package be.intecbrussel.notebook.entities.animal_entities;
import be.intecbrussel.notebook.entities.plant_entities.Plant;
import java.util.Set;

public class Herbivore extends Animal {

    private Set<Plant> plantDiet;

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant){
        // add plant to plantDiet list
    }

    public void printDiet(){
        // print diet
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "plantDiet=" + plantDiet +
                '}';
    }
}
