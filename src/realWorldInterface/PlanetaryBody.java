/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realWorldInterface;


/**
 *
 * @author chris
 */
public abstract class PlanetaryBody implements CelestialBody {
    //super class properties
    private double bodyDiameterKM;
    private String name;
    private double luminosity;
    
    private int yearLength;
    private int numOfMoons;
    private boolean hasRings;

    public final int getYearLength() {
        return yearLength;
    }

    public final void setYearLength(int yearLength) {
        this.yearLength = yearLength;
    }

    public final int getNumOfMoons() {
        return numOfMoons;
    }

    public final void setNumOfMoons(int numOfMoons) {
        this.numOfMoons = numOfMoons;
    }

    public final boolean isHasRings() {
        return hasRings;
    }

    public final void setHasRings(boolean hasRings) {
        this.hasRings = hasRings;
    }
    
    
}
