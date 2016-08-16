import greenfoot.*;

public class Clarity extends Actor
{
    int opaque = 240;
    public Clarity()
    {
    }
    public Clarity(GreenfootImage image){
        GreenfootImage Image = new GreenfootImage(image);
        setImage(Image);
    }
    public void act() 
    {
        getImage().setTransparency(opaque);
        if (opaque!=0){
            opaque-=20;
        }else{
            getWorld().removeObject(this);
        }
    }    
}
