/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritenceExercise;

/**
 *
 * @author chris
 */
public class InheritenceExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.setHasWater(true);
        earth.setBodyDiameterKM(12700);
        earth.setPlanetClass("M");
        earth.setYearLength(365);
        earth.setHasRings(false);
        earth.setNumOfMoons(1);
        earth.setName("Earth");
        System.out.println(earth.getName() + " has: " + earth.getNumOfMoons() + " moon(s)"
        );
        if(earth.isHasRings()){
            System.out.println("It has rings");
        }else{
            System.out.println("It does not have rings");
        }
        
        earth.colonizePlanet();
    }
    
}
