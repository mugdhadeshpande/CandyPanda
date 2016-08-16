import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Points here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Points extends Actor implements MsgSub
{
    /**
     * Act - do whatever the Points wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Msgobs mo;
    private static int sc=0;

    public void Points(Msgobs mo)
    {
        this.mo = mo;
    }
    public void notify(int sco, CandyPanda fw)
    {
     Msgobs mo = new Msg();
     mo.update(sco,fw);   
    }
    public void act() 
    {
        // Add your action code here.
    }    
    public int getScore()
    {
        return sc;
    }
    public void setScore(int score)
    {
        sc=score;
    }
    public void addScore(int score,CandyPanda fw)
    {
        sc+=score; 
        notify(sc,fw);
    }
}

