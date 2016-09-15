/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicalInteface;

/**
 *
 * @author chris
 */
public abstract class humanoid implements MiddleEarthBeing{
    private int numOfEyes;
    
    private boolean abilityToSpeak;

    public int getNumOfEyes() {
        return numOfEyes;
    }

    public void setNumOfEyes(int numOfEyes) {
        this.numOfEyes = numOfEyes;
    }

    public boolean isAbilityToSpeak() {
        return abilityToSpeak;
    }

    public void setAbilityToSpeak(boolean abilityToSpeak) {
        this.abilityToSpeak = abilityToSpeak;
    }
    
    
    
}
