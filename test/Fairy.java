/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public abstract class Fairy {

    public void castSpell() {
        System.out.println("spell is cast");
    }

    public void speak() {
        System.out.println("fiary spoke");
    }
    
    public void giveFairyGold(int amount){
        System.out.println("fairy offered:" + amount + " gold");
    }
    
}
