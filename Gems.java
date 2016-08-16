import java.util.*;
import greenfoot.*;
/**
 * Write a description of class Gems here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gems extends Candy implements Part
{   
    ArrayList<Part> Gems = new ArrayList<Part>();
    static int xc=0;
    static int random=0;
    int x=0;
    //static World world;
    
    /*
    public ArrayList<Part> clearArrayList()
    {
        Gems = new ArrayList<Part>();
        return Gems;
    }
    */
    
    public void removeWorldObject(){
        getWorld().removeObject(this);
    }
    
    public void addChild(Part c)
    {
        Gems.add(c);
    }
    
    public void removeChild(Part c)
    {
        Gems.remove(c);
    }
    
    public Part getChild(int i)
    {
        return Gems.get(i);
    }
    
    public ArrayList<Part> getBunch(){
        return Gems;
    }
    public void act() 
    {   
        //addChildren((CandyPanda)getWorld());
        path();
    }
    
    public void addChildren(CandyPanda fn){
    
        xc=Greenfoot.getRandomNumber(600);
            if(xc>=20 && xc<=580)           // so that candy does'nt go out of the screen
            {
              while(x < 2)
              {
              random=Greenfoot.getRandomNumber(3);                 
                  switch(random)
                  {           
                    case 0:
                      Kisses s1 = (Kisses)CandyStore.create(CandyType.KISSES);
                      addChild(s1);
                      fn.addObject(s1,xc, 500);
                      break;
                      
                    case 1:
                      Kisses s2 = (Kisses)CandyStore.create(CandyType.KISSES);
                      addChild(s2);
                      fn.addObject(s2,xc, 500);
                      break;
                      
                      
                    case 2:
                      Kisses s3 = (Kisses)CandyStore.create(CandyType.KISSES);
                      addChild(s3);
                      fn.addObject(s3,xc, 500);
                      break;
                    }
              x++;
              }
            }
        x=0;       
    }
    
     
    public void path()
    {
        //world = getWorld();
        //addChildren((CandyPanda)world);
        for(Part c : Gems)
        {
            c.path();
        }
        removeWorldObject();
        //Gems = new ArrayList<Part>();
        
    }

    
    public void remove(CandyPanda fn)
    {
       for(Part c : Gems)
       {
        c.remove(fn);
       } 
    }
    
   
   
}
