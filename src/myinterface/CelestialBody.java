/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

import concrete.*;

/**
 *
 * @author chris
 */
public interface CelestialBody {


    public abstract double getBodyDiameterKM();
    

    public abstract void setBodyDiameterKM(double bodyDiameterKM);  
    

    public abstract String getName();

    public abstract void setName(String name);
    
    
    
}
