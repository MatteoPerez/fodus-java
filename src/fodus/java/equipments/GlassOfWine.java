package fodus.java.equipments;

import fodus.java.Character;
import fodus.java.status.Strength;

/**
* Ultimate drink to enhance strength and recover.
*/
public class GlassOfWine extends Potions {
    public GlassOfWine(){
        this.name="Verre de Vin";
        this.throwable = false;
        this.maxHealthPoints = 10;
        this.strength = 10;
        this.maxMana = 10;
        this.intelligence = 5;
    }
    
    /**
    * Drink the potion to heal and boost strength.
    * @param target the target of the attack
    */
    @Override
    public void usePotion(Character target){
        System.out.println("Vous vous delectez de ce delicieux nectar !");
        if(target.healthPoints + this.intelligence >= this.maxHealthPoints){
            target.healthPoints = target.maxHealthPoints;
        }
        else {
            target.healthPoints += this.intelligence;
        }
        Strength incr_srength_effect = new Strength(3,50);
        target.addToken(incr_srength_effect);
    }
}
