/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

/**
 *
 * @author chris
 */
public class Planet extends PlanetaryBody{
    private String planetClass;
    private boolean hasWater;
    private boolean livable;
    
    

    public String getPlanetClass() {
        return planetClass;
    }

    public void setPlanetClass(String planetClass) {
        this.planetClass = planetClass;
    }

    public boolean isHasWater() {
        return hasWater;
    }

    public void setHasWater(boolean hasWater) {
        this.hasWater = hasWater;
    }


    
    public boolean isLivable(){
        return livable;
    }
    
   private boolean setLivable(){
       if(planetClass.equals("M") && hasWater == true){
           livable = true;
       }
       else{
           livable = false;
       }
       return livable;
   }
    public void colonizePlanet(){
        if(setLivable()){
            System.out.println("Let's Plant a Flag on it");
        }else{
            System.out.println("Doesn't Support Life, Keep Looking");
        }
    }
    
    
    
    
}
