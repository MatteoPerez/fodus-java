/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fodus.java.player;

/**
 *
 * @author samac
 */
public class Barbarian extends Player implements Damage, Tank {
    @Override
    public void attack() {
        System.out.println("Vous attaquez avec votre hache à deux mains !");
    }
    @Override
    public void defend() {
        System.out.println("Vous vous préparez à encaisser les coups.");
    }
    @Override
        public void cri_de_Guerre(){ // oblige l'ennemi à attaquer et immunité pendant 1 tour
            
        }
    @Override    
        public void contre(){//pourcentage de chance d'infliger une attaque de base
            
        }
    @Override    
        public void vol_de_vie(){//vol de points de vie de l'ennemi
            
        }
}
