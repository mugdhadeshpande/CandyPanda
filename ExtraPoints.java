import greenfoot.*;
/**
 * Write a description of class ExtraPoints here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExtraPoints extends Actor
{
   
    public static ExtraBonus create(ExtraPointType select) {
		ExtraBonus extra = null;
		switch (select) {
    		case TWICE:
    			extra = new Twice();
    			break;
    
    		case ADDITIONAL:
    			extra = new Additional();
    			break;
    
		}
		return extra;
	}
}
