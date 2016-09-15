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
 public class CelestialBody {
     private String name;
     private double luminosity;
     private double bodyDiameterKM;

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final double getLuminosity() {
        return luminosity;
    }

    public final void setLuminosity(double luminosity) {
        this.luminosity = luminosity;
    }

    public final double getBodyDiameterKM() {
        return bodyDiameterKM;
    }

    public final void setBodyDiameterKM(double bodyDiameterKM) {
        this.bodyDiameterKM = bodyDiameterKM;
    }


    
    
    
}
