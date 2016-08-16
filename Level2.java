import greenfoot.*;

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Actor implements Levels
{
    /**
     * Act - do whatever the Level2 wants to do. This method is called whenever
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
        setTimer(3600);
    }
    
    public int getTimer(){
       return timer;
    }
}
