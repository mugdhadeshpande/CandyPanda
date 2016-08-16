import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A dart is used to remove balloons.
 * 
 * @ author Sarika Kale
 */
public class Cutting extends Actor implements Sub
{
    /**
     * Make the dart follow the mouse and check for mouseclicks.
     */
    static boolean shadowImagery = true;
    static int num=0;
    Candy f;
    ExtraBonus bon;
    Noticer obs;

    public void Cutting(Noticer obs)
    {
        this.obs=obs;
    }
    public void notifyObservers(Candy f, CandyPanda fn)
        {
            obs.update(f, fn);
        }
        
    public void act() 
    {   
        if(Greenfoot.mousePressed(this))
        {
          getImage().setTransparency(200);
        }
        else if(Greenfoot.mouseClicked(this))
        {
          getImage().setTransparency(0);
        }
        
        // Follow the mouse
        if(Greenfoot.mouseDragged(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            
            if (shadowImagery==true){
               getWorld().addObject(new Clarity(getImage()),getX(),getY());}
            
            setLocation(mouse.getX(), mouse.getY());
        }
        
        
        if(Greenfoot.mouseDragged(null)) {
            Candy f = (Candy) getOneIntersectingObject( Candy.class);
            obs=new Candy();
            if(f!= null) {
                CandyPanda fn = (CandyPanda)getWorld();
                //System.out.println(fn);
                notifyObservers(f, fn);
                //Greenfoot.delay(20);
                fn.removeObject(f);
                
            }
        }
                     
        
        if(Greenfoot.mouseDragged(null)) {     
            ExtraBonus b = (ExtraBonus) getOneIntersectingObject(ExtraBonus.class);
            bon=new ExtraBonus();
            if(b != null) {
                CandyPanda fn = (CandyPanda)getWorld();
                bon.call(b,fn);
                fn.removeObject(b);
            }
        }
        
        if(Greenfoot.mouseDragged(null)) {
            Poison bm = (Poison) getOneIntersectingObject( Poison.class);
            if(bm != null) {
                bm.remove();
                ((CandyPanda) getWorld()).endGame();
            }
        }
    }    
    
}
