/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

/**
 *
 * @author Ljubica
 */
public class Helper {
    public static int getRandomInteger() {
        return (int) (Math.random() * 1000);
    }
    
    public static String generateTitle() {
        return "Evropa-" + getRandomInteger();
    }
    
    public static String generateTitle2() {
        return "Beograd-" + getRandomInteger();
        
    }
   
}
