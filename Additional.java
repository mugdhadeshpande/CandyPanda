import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Extra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Additional extends ExtraBonus
{
    static int c=0;
    /**
     * Act - do whatever the Extra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX()+2, getY() );
        if (getX() == 590) {
            getWorld().removeObject(this);
            CandyPanda.num3=0;
        }
    }    
     public void remove(CandyPanda fn) 
    {
        	Greenfoot.playSound("cut.mp3");
        	//((CandyPanda) getWorld()).countExtra();
        	fn.num(20,fn);
        	GreenfootImage extra = new GreenfootImage("explosion.png");
        	setImage(extra);
     }   
}

