package be.intecbrussel.notebook.entities.animal_entities;
import be.intecbrussel.notebook.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal {

    private Set<Plant> plantDiet = new HashSet<>();

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

    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);
    }

    public void printDiet(){
        for (Plant plant : plantDiet){
            System.out.println(plant);
        }
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "plantDiet=" + plantDiet +
                '}';
    }
}
