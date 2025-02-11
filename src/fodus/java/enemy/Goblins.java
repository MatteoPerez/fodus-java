package fodus.java.enemy;

import java.util.Random;
import fodus.java.status.Bleed;
import fodus.java.Character;
import fodus.java.equipments.PiercingShield;
import fodus.java.status.Block;

/**
 * Goblins : one of the many enemies.
 */
public class Goblins extends Enemy {
    Random r = new Random();
    public Goblins(){
        this.name = "Gobelin";
        this.maxHealthPoints = 25;
        this.healthPoints = this.maxHealthPoints;
        this.speed = 10;
        this.strength = 7;
        this.dexterity = 10;
        this.endurance = 10;
        this.intelligence = 15;
        this.drop = new PiercingShield();
    }
    @Override
    public void enemyAction(Character target){
        int action = r.nextInt(4);
        switch(action){
            case 0, 1:
                attack(target);
                break;
            case 2:
                defend();
                break;
            case 3:
                specialGoblin(target);
                break;
        }
    }
    @Override
    public void attack(Character target){
        System.out.println("Le Gobelin brandit sa masse et vous assene un coup !");
        target.receiveDamage(this.strength);
    }
    @Override
    public void defend(){
        Block blockEffect = new Block(1, 50);
        this.addToken(blockEffect);
        System.out.println("Le Gobelin brandit son bouclier pour encaisser votre attaque.");
    }
    public void specialGoblin(Character target) {
        System.out.println("Le Gobelin decide de vous poignarder avec sa lame rouillee !");
        Bleed bleedEffect = new Bleed(4, 2);
        target.addDOT(bleedEffect);
    }
}
