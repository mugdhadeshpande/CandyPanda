import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An MilkyWay flows from bottom to top.
 * 
 * @author Poul Henriksen
 */
public class MilkyWay extends Candy implements Part
{
    /**
     * Moving the MilkyWay. 
     */ 
    int num=0;
    int x=2,y=-2;
    int flag=0;
    static int loop=0,ht;
    
    MilkyWay()
    {
     super(CandyType.MILKYWAY);
    }
    
    public void act() 
    {
        path();
    }
     public void path() {
       setLocation(getX(), getY() +y);
       ht=100;
        
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
            x=x*(2);
            y=y*(-2);
        }
        if(flag==1 && getY()==0)
        {
            getImage().setTransparency(0);
            flag=0;
        }

        //make the MilkyWay disappear
        if(getY()>=490 && num>0)
        {
            System.out.println(getWorld());
           getWorld().removeObject(this);
        }   
    }
   
 
    /**
     * Pop this MilkyWay.
     */
    public void remove(CandyPanda fn) 
    {
        Greenfoot.playSound("cut.mp3");
      //  ((CandyPanda) getWorld()).countFruits();
        fn.num(10,fn);
        GreenfootImage MilkyWay= new GreenfootImage("appleCut.png");
        setImage(MilkyWay);
        //Greenfoot.delay(20);
        //fn.removeObject(this);
    }
}
