package fodus.java.equipments;
import fodus.java.player.Player;

/**
* Abstract class that represents all equipments and objects.
*/
public abstract class Equipments {
    protected String name;
    public int strength, dexterity, endurance, intelligence;
    public int maxHealthPoints, maxMana, speed;
    
    public String getName() {
        return this.name;
    }
    /**
     * Adds the stats of the weapon to the player.
     * @param player the player
     * @param equipment the equipment
     */
    public void addStats(Player player, Equipments equipment){
        player.maxHealthPoints += equipment.maxHealthPoints;
        player.maxMana += equipment.maxMana;
        player.speed += equipment.speed;
        player.strength += equipment.strength;
        player.dexterity += equipment.dexterity;
        player.endurance += equipment.endurance;
        player.intelligence += equipment.intelligence;
    }
    /**
     * Prints the stats of the weapon.
     */
    public void printStats() {
        System.out.println("Vitesse : +" + speed);
        System.out.println("Force : +" + strength);
        System.out.println("Dexterite : +" + dexterity);
        System.out.println("Endurance : " + endurance);
        System.out.println("Intelligence : +" + intelligence);
    }
}

