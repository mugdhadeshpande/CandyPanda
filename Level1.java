import greenfoot.*;

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Actor implements Levels
{
    /**
     * Act - do whatever the Level1 wants to do. This method is called whenever
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
        setTimer(5400);
    }
    
    public int getTimer(){
       return timer;
    }
}
