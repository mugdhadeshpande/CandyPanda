import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Twix here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kisses extends Candy implements Part
{
    /**
     * Moving the Twix. 
     */ 
    int num=0;
    int x=2,y=-2;
    int flag=0;
    static int loop=0,ht;
    
    Kisses()
    {
     super(CandyType.KISSES);
    }
    
    /*
    public void act() 
    {
        path();
    }
    */
    
    public void path()
    {
        setLocation(getX(), getY() +y);
        ht=100;//till what height can candy travel
        //System.out.println("Height value " + ht);
        if(getY()<=ht)
        {
            num++;
            loop=Greenfoot.getRandomNumber(2);
            System.out.println("Loop value " + loop);
            if(loop==0)//loop - how much dist to move after reaching a particular height(ht)
            {  
             move(-20);   
            }
            else
            {
             move(20);   
            }
            flag=1;
            x=x*(2);
            y=y*(-2);
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
        
        
        //make the Snickers disappear
        if(getY()>=490 && num>0)
        {
           getWorld().removeObject(this);
        }
        
       
    }
    
    /**
     * Pop this kisses.
     */
    public void remove(CandyPanda fn) 
    {
        Greenfoot.playSound("cut.mp3");
        fn.num(10,fn);
        GreenfootImage Kisses = new GreenfootImage("bananaCut.png");
        setImage(Kisses);
    }  
}
