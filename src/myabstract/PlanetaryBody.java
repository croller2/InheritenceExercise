/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

import concrete.*;

/**
 *
 * @author chris
 */
public class PlanetaryBody extends CelestialBody {
    private int yearLength;
    private int numOfMoons;
    private boolean hasRings;
    private double distanceFromSun;
    private final static double speedOfLight = 299792458;

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

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public static double getSpeedOfLight() {
        return speedOfLight;
    }
    
    

    @Override
    public double calculateLightTimeToBody() {
        return distanceFromSun * speedOfLight;
    }

    
    
}
