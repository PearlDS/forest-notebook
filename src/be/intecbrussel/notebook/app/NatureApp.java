package be.intecbrussel.notebook.app;
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

       Omnivore pig = new Omnivore("Pig", 136,80,90);
       Set<Plant> pigDiet = new HashSet<>();
       pig.setPlantDiet(pigDiet);



       forestGuardNotebook.printNotebook();
       System.out.println("---------------");




        System.out.println("You have added " + forestGuardNotebook.getPlantCount() + " plants to your notebook");
        System.out.println("You have added " + forestGuardNotebook.getAnimalCount() + " animals to your notebook");

    }
}
