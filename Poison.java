import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poison here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poison extends Actor
{
    /**
     * Act - do whatever the poison wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    /**
     * Moving the MilkyWay. 
     */ 
    int num=0;
    int x=1,y=-1;
    int flag=0;
    static int loop=0,ht;
    public void act() 
    {
        setLocation(getX(), getY() +y);
        ht=100;//till what height can candy travel
        if(getY()<=ht)
        {
            num++;
            loop=Greenfoot.getRandomNumber(2);
            if(loop==0)//loop - how much dist to move after reaching a particular height(ht)
            {  
             move(-20);   
            }
            else
            {
             move(20);   
            }
            flag=1;
            x=x*(1);
            y=y*(-1);
        }
        
        if(flag==1 && getY()==0)
        {
            getImage().setTransparency(0);
            flag=0;
        }
        if(getX()<=10 || getX()>=590)
        {
            move(-25);
            x=0;
        }

        if(getY()>=490 && num>0)
           getImage().setTransparency(0);

    }    
    
    /**
     * Pop this poison.
     */
    public void remove() 
    {
        Greenfoot.playSound("cut.mp3");
        GreenfootImage poison= new GreenfootImage("explosion.png");
        setImage(poison);
        Greenfoot.delay(2);
        getWorld().removeObject(this);
    }   
}
