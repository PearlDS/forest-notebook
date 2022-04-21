package be.intecbrussel.notebook.app;
import be.intecbrussel.notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.notebook.entities.plant_entities.*;
import be.intecbrussel.notebook.service.ForestNotebook;
import java.util.HashSet;
import java.util.Set;


public class NatureApp {
    public static void main(String[] args) {

        ForestNotebook forestGuardNotebook = new ForestNotebook();

        Tree oak = new Tree("Oak");
        oak.setLeafType(LeafType.ROUND);
        oak.setHeight(25);
        forestGuardNotebook.addPlant(oak);

        Tree magnolia = new Tree("Magnolia");
        magnolia.setLeafType(LeafType.ROUND);
        magnolia.setHeight(6);
        forestGuardNotebook.addPlant(magnolia);

        Flower rose = new Flower("Rose");
        rose.setSmell(Scent.SWEET);
        rose.setHeight(0.3);
        forestGuardNotebook.addPlant(rose);

        Weed snowcap = new Weed("Snowcap");
        snowcap.setArea(5.7);
        snowcap.setHeight(0.9);
        forestGuardNotebook.addPlant(snowcap);

        Weed chickweed = new Weed("Chickweed");
        chickweed.setArea(4);
        chickweed.setHeight(0.3);
        forestGuardNotebook.addPlant(chickweed);

        Weed goosegrass = new Weed("Goosegrass");
        goosegrass.setArea(15);
        goosegrass.setHeight(0.5);
        forestGuardNotebook.addPlant(goosegrass);

        Bush japaneseLaurel = new Bush("Japanese Laurel");
        japaneseLaurel.setLeafType(LeafType.ROUND);
        japaneseLaurel.setFruit("Red Berries");
        japaneseLaurel.setHeight(1.3);
        forestGuardNotebook.addPlant(japaneseLaurel);



        Herbivore bunny = new Herbivore("Bunny",1.5,0.5,0.7);
        Set<Plant> bunnyDiet = new HashSet<>();
        bunny.setPlantDiet(bunnyDiet);
        bunny.addPlantToDiet(rose);
        bunny.addPlantToDiet(snowcap);
        bunny.addPlantToDiet(chickweed);
        bunny.addPlantToDiet(goosegrass);
        forestGuardNotebook.addAnimal(bunny);

        Herbivore deer = new Herbivore("Deer",20,1.3,1);
        Set<Plant> deerDiet = new HashSet<>();
        deer.setPlantDiet(deerDiet);
        deer.addPlantToDiet(snowcap);
        deer.addPlantToDiet(oak);
        deer.addPlantToDiet(goosegrass);
        forestGuardNotebook.addAnimal(deer);

        Omnivore pig = new Omnivore("Pig", 136,80,90);
        Set<Plant> pigDiet = new HashSet<>();
        pig.setPlantDiet(pigDiet);
        pig.addPlantToDiet(chickweed);
        pig.addPlantToDiet(goosegrass);
        pig.setMaxFoodSize(0.90);
        forestGuardNotebook.addAnimal(pig);

        Omnivore bear = new Omnivore("Bear",200,150,70);
        Set<Plant> bearDiet = new HashSet<>();
        bear.setPlantDiet(bearDiet);
        bear.addPlantToDiet(goosegrass);
        bear.addPlantToDiet(japaneseLaurel);
        bear.setMaxFoodSize(20);
        forestGuardNotebook.addAnimal(bear);

        Omnivore boar = new Omnivore("Boar",50,1.3,90);
        Set<Plant> boarDiet = new HashSet<>();
        boar.setPlantDiet(boarDiet);
        boar.addPlantToDiet(japaneseLaurel);
        boar.setMaxFoodSize(0.50);
        forestGuardNotebook.addAnimal(boar);


        Carnivore lion = new Carnivore("Lion",2,2,2);
        lion.setMaxFoodSize(1.30);
        forestGuardNotebook.addAnimal(lion);

        Carnivore cat = new Carnivore("Cat",2,0.5,2);
        cat.setMaxFoodSize(2);
        forestGuardNotebook.addAnimal(cat);

        Carnivore panther = new Carnivore("Panther",20,2,1.9);
        panther.setMaxFoodSize(1.30);
        forestGuardNotebook.addAnimal(panther);

        Carnivore tiger = new Carnivore("Tiger",60,2.5,4);
        tiger.setMaxFoodSize(4);
        forestGuardNotebook.addAnimal(tiger);


        System.out.println("Notebook list before sorting: ");
        forestGuardNotebook.printNotebook();
        System.out.println("-----------------------");
        System.out.println("Notebooklist after sorting by name: ");
        forestGuardNotebook.sortPlantsByName();
        forestGuardNotebook.sortAnimalsByName();
        forestGuardNotebook.printNotebook();
        System.out.println("-----------------------");
        System.out.println("Notebooklist after sorting by height: ");
        forestGuardNotebook.sortPlantsByHeight();
        forestGuardNotebook.sortAnimalsByHeight();
        forestGuardNotebook.printNotebook();
        System.out.println("-----------------------");


        System.out.println();
        System.out.println("List of carnivores added to your notebook");
        System.out.println(forestGuardNotebook.getCarnivores());
        System.out.println("----------------------");
        System.out.println("List of herbivores added to your notebook");
        System.out.println(forestGuardNotebook.getHerbivores());
        System.out.println("------------------------");
        System.out.println("List of omnivores added to your notebook");
        System.out.println(forestGuardNotebook.getOmnivores());


        System.out.println("You have added " + forestGuardNotebook.getPlantCount() + " plants to your notebook");
        System.out.println("You have added " + forestGuardNotebook.getAnimalCount() + " animals to your notebook");

    }
}
