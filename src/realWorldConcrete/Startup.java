/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realWorldConcrete;

/**
 *
 * @author chris
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.setHasWater(true);
        earth.setBodyDiameterKM(12700);
        earth.setPlanetClass("M");
        earth.setYearLength(365);

        earth.setName("Earth");
 
        earth.colonizePlanet();
    }
    
}
