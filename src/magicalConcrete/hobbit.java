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
public class hobbit extends humanoid {

    private String[] mealsInDay = {"breakfast" , "secondBreakfast" , "thirdBreakfast" , "brunch" , "lunch" , "dinner" , "supper" , "bedTimeSnack"};

    
    public String getLastMeal(double milTime){
        if(milTime > 0 && milTime < 700){
            return mealsInDay[0];
        }else if (milTime >= 700 && milTime < 800){
            return mealsInDay[1];
        }else if (milTime >= 800 && milTime < 1100){
            return mealsInDay[2];
        }else if (milTime >= 1100 && milTime < 1200){
            return mealsInDay[3];
        }else if (milTime >= 1200 && milTime < 1400){
            return mealsInDay[4];
        }else if (milTime >= 1400 && milTime < 1600){
            return mealsInDay[5];
        }else if (milTime >= 1600 && milTime < 2000){
            return mealsInDay[6];
        }else{
            return mealsInDay[7];
        }
       }
    
    
}
