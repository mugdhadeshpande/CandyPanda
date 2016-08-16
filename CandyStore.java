import greenfoot.*;
/**
 * Write a description of class FruitInterface here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CandyStore extends Actor
{   
   
   public static Candy create(CandyType select) {
        Candy candy = null;
        switch (select) {
            case MILKYWAY:
                candy = new MilkyWay();
                break;
            case TWIX:
                candy = new Twix();
                break;
            case SNICKERS:
                candy = new Snickers();
                break;
            case GEMS:
                candy = new Gems();
                break;
            case KISSES:
                candy = new Kisses();
                break;
        }
        return candy;
    }
    
}
