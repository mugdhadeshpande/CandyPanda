import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartGame extends Actor
{
    static int i=0; 
     private int timer=3600;
    Text timerText = new Text();
    public StartGame (){    
        GreenfootImage image = getImage();
        image.scale(75,75);
           
    }
    
    public void act() 
    {
        if (Greenfoot.mousePressed(this)){
        setReset(1);
        CandyPanda world=(CandyPanda)getWorld();
        world.z=true;
        world.removeInstructions();
        world.setPaintOrder(PointBoard.class, Cutting.class, MilkyWay.class, Number.class);
        world.populate();
        
     }
    }
    
    
    public int getReset()
    {
        return i;
    }
    
    public void setReset(int i)
    {
        this.i = i;
    }
    
}

