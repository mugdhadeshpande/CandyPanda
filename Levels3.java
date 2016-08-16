import greenfoot.*;

/**
 * Write a description of class Levels3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Levels3 extends Actor implements Levels
{
    /**
     * Act - do whatever the Levels3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer;
    public void act() 
    {
        // Add your action code here.
    }    
    public void setTimer(int timer){
       this.timer=timer;
    }
    public void setTimerLevel(){
        setTimer(1800);
    }
    
    public int getTimer(){
       return timer;
    }
}
