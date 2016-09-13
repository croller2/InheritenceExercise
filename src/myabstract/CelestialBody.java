/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;


/**
 *
 * @author chris
 */
public abstract class CelestialBody {
    private double bodyDiameterKM;
    private String name;
    private double luminosity;

    public abstract double calculateLightTimeToBody();
    
    public double getBodyDiameterKM() {
        return bodyDiameterKM;
    }

    public void setBodyDiameterKM(double bodyDiameterKM) {
        this.bodyDiameterKM = bodyDiameterKM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLuminosity() {
        return luminosity;
    }

    public void setLuminosity(double luminosity) {
        this.luminosity = luminosity;
    }
    
    
    
}
