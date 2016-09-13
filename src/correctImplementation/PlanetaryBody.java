/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctImplementation;

import concrete.*;

/**
 *
 * @author chris
 */
public abstract class PlanetaryBody extends CelestialBody {
    private int yearLength;
    private int numOfMoons;
    private boolean hasRings;

    public int getYearLength() {
        return yearLength;
    }

    public void setYearLength(int yearLength) {
        this.yearLength = yearLength;
    }

    public int getNumOfMoons() {
        return numOfMoons;
    }

    public void setNumOfMoons(int numOfMoons) {
        this.numOfMoons = numOfMoons;
    }

    public boolean isHasRings() {
        return hasRings;
    }

    public void setHasRings(boolean hasRings) {
        this.hasRings = hasRings;
    }
    
    
}
