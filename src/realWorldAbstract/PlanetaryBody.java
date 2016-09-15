/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realWorldAbstract;


/**
 *
 * @author chris
 */
public abstract class PlanetaryBody extends CelestialBody {
    private int yearLength;
    private double distanceFromSun;
    private final static double speedOfLight = 299792458;

    public int getYearLength() {
        return yearLength;
    }

    public void setYearLength(int yearLength) {
        this.yearLength = yearLength;
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
    
   
    public double calculateLightTimeToBody() {
        return distanceFromSun * speedOfLight;
    }

    
    
}
