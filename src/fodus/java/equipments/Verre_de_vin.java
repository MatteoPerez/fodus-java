/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fodus.java.equipments;

/**
 *
 * @author rmeun
 */
public class Verre_de_vin extends Potions {
    public Verre_de_vin(){
        this.maxHealthPoints=10;
        this.strength=10;
        this.maxmana=10;
        this.intelligence=5;
    }
    public void spe_verre_de_vin(){
        System.out.println("Vous vous régalez de verre de vin rouge et vous gagnez une dose infini de charisme et un important bonus d'attaque !");
    }
}
