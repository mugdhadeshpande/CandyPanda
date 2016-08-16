import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Candy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Candy extends Actor implements Noticer
{
    /**
     * Act - do whatever the Candy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
   public Candy()
   {
   }
    
   public Candy(CandyType select) {
        this.select = select;
    }
    

    // Do subclass level processing in this method
    private CandyType select = null;

    public CandyType getChoice() {
        return select;
    }

    public void setChoice(CandyType select) {
        this.select = select;
    }
    
    public void update(Candy f, CandyPanda fn)
    {
     GreenfootImage img = f.getImage();
     String candyName = img.toString();
     
     if(candyName.contains("MilkyWay"))
     {
      MilkyWay a = new MilkyWay();
      a.remove(fn);
     }
     else if(candyName.contains("Twix"))
     {
      Twix b = new Twix();
      b.remove(fn);
     }
     else if(candyName.contains("Snickers"))
     {
      Snickers o = new Snickers();
      o.remove(fn);
     }
     else if(candyName.contains("Gems"))
     {
      Gems b = new Gems();
      b.remove(fn);
      
     }
     else if(candyName.contains("Kisses"))
     {
      Kisses s = new Kisses();
      s.remove(fn);
     }
     
    }
    
}
