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

 



    @Override
    public void setHasRings(boolean hasRings) {
        super.setHasRings(hasRings); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isHasRings() {
        return super.isHasRings(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNumOfMoons(int numOfMoons) {
        super.setNumOfMoons(numOfMoons); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumOfMoons() {
        return super.getNumOfMoons(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setYearLength(int yearLength) {
        super.setYearLength(yearLength); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getYearLength() {
        return super.getYearLength(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
