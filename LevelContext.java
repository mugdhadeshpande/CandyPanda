import greenfoot.*;

/**
 * Write a description of class LevelContext here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelContext extends Actor
{
    /**
     * Act - do whatever the LevelContext wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
   private Levels level;
    
   public LevelContext(Levels level){
       this.level=level;
       setTimerLevel();
    }
   
    public void act() 
    {
        // Add your action code here.
    }  
    
    public void setTimerLevel(){
    this.level.setTimerLevel();
    }
    
  public Levels nextLevel(){
      if(getLevel() instanceof Level1){
          Levels level2=new Level2();
          return level2;
        }else{
            
            if(getLevel() instanceof Level2){
            Levels level3=new Levels3();
            return level3;
            }else{
                return null;
            }
        }
        
        // null;
    }
    
    public void setLevel(Levels level){
        this.level=level;
    }
    
    public Levels getLevel(){
    return level;
    }
    
}



