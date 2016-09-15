/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicalConcrete;

/**
 *
 * @author chris
 */
public class humanoid extends MiddleEarthBeing {
    private int numOfEyes;
    
    private boolean abilityToSpeak;

    public final int getNumOfEyes() {
        return numOfEyes;
    }

    public final void setNumOfEyes(int numOfEyes) {
        this.numOfEyes = numOfEyes;
    }

    public final boolean isAbilityToSpeak() {
        return abilityToSpeak;
    }

    public final void setAbilityToSpeak(boolean abilityToSpeak) {
        this.abilityToSpeak = abilityToSpeak;
    }  
}
