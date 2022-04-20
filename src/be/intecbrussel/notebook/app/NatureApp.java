package be.intecbrussel.notebook.app;
import be.intecbrussel.notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.notebook.entities.plant_entities.*;
import be.intecbrussel.notebook.service.ForestNotebook;
import java.util.Set;


public class NatureApp {
    public static void main(String[] args) {

        ForestNotebook forestGuardNotebook = new ForestNotebook();

        Tree oak = new Tree("Oak");
        oak.setLeafType(LeafType.ROUND);
        oak.setHeight(25);
        forestGuardNotebook.addPlant(oak);

        Flower rose = new Flower("Rose");
        rose.setSmell(Scent.SWEET);
        rose.setHeight(0.3);
        forestGuardNotebook.addPlant(rose);

        Weed snowcap = new Weed("Snowcap");
        snowcap.setArea(5.7);
        snowcap.setHeight(0.9);
        forestGuardNotebook.addPlant(snowcap);

        Bush japaneseLaurel = new Bush("Japanese Laurel");
        japaneseLaurel.setLeafType(LeafType.ROUND);
        japaneseLaurel.setFruit("Red Berries");
        japaneseLaurel.setHeight(1.3);
        forestGuardNotebook.addPlant(japaneseLaurel);

       Tree magnolia = new Tree("Magnolia");
       magnolia.setLeafType(LeafType.ROUND);
       magnolia.setHeight(6);
       forestGuardNotebook.addPlant(magnolia);


        System.out.println("You have added " + forestGuardNotebook.getPlantCount() + " plants to your notebook");

    }
}
