import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Extra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExtraBonus extends Actor implements Order
{
    
	private ExtraPointType select = null;
    /**
     * Act - do whatever the Extra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public ExtraBonus()
    {
    }
    public ExtraBonus(ExtraPointType select) {
		this.select = select;
		
	}
	
	public ExtraPointType getChoice() {
		return select;
	}

	public void setChoice(ExtraPointType select) {
		this.select = select;
	}
    public void call(ExtraBonus b, CandyPanda fn)
    {
     GreenfootImage img = b.getImage();
     String extraName = img.toString();
     if(extraName.contains("Additional"))
     {
      Additional e = new Additional();
      e.remove(fn);
     }
     else if(extraName.contains("Twice"))
     {
      Twice d = new Twice();
      d.remove(fn);
     }
    }
}
