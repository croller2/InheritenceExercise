/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class StartUp {
    public static void main(String[] args) {
        Fairy fairy = new Fairy();
        
        fairy.castSpell();
        fairy.speak();
        fairy.giveFairyGold(6);
    }
}
