package be.intecbrussel.notebook.service;
import be.intecbrussel.notebook.entities.animal_entities.Animal;
import be.intecbrussel.notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.notebook.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.List;

public class ForestNotebook {

    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();


    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plants.size();
    }

    public int getAnimalCount() {
        return animals.size();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void addPlant(Plant plant){
        plants.add(plant);
    }

    public void printNotebook(){
        for (Plant plant : plants ){
            System.out.println(plant);
        }

        for (Animal animal : animals){
            System.out.println(animals);
        }
    }

    public void sortAnimalsByName(){
        // sort the animal list by name
    }

    public void sortPlantsByName(){
        // sort the plant list by name
    }

}
