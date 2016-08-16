import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class CandyPanda extends World 
{
    Number num = new Number("Points: ");
    static int x=0;
    static int xc=0;
    //static int sc=0;
    Rules ruls;
    StartGame game;
    Points s;
    boolean c = true;
    public static boolean z = false;
    public static int num3=0, num1=0;
    Twice d;
     private int timer=5400;
    Text timerText = new Text();
     Levels level1=new Level1();
    LevelContext levelContext=new LevelContext(level1);
   
   
    
    public CandyPanda()
    {    
        super(600, 500, 1);
        this.showStartScreen();
        //Greenfoot.setWorld(this);
       
    }
    
            
    public void showStartScreen(){
        game = new StartGame();
        ruls = new Rules();
        addObject(ruls,300, 250);
        addObject(game,300,423);
        
    }
    
    public void removeInstructions(){
        this.removeObject(game);
        this.removeObject(ruls);
    }
    
    
    public void act() 
    {
       if(game.getReset()==1) 
        reset();  
      
       
       
    }
    public void startTimer(World world){
          //wherever
          if(timer>0){
            timer--;
          
            timerText.setText("Time Left: "+timer/60);
            if(timer==0)
            Greenfoot.stop();
        }
    }
    public void reset()
    {
        if(c==true)
        {
         MouseInfo m = Greenfoot.getMouseInfo();
         if(m != null && Greenfoot.mousePressed(null)) {
            int x = m.getX();
            int y = m.getY();
            addObject(new Cutting(), x, y);
            c=false;
        }
    }
      if(timer>0){
            timer--;
          
            timerText.setText("Time Left: "+timer/60);
            if(timer==0){
           // Greenfoot.stop();
            //nextLevel()
           // timer=1800;
            if(levelContext.getLevel()!=null){
              
                getNextLevelMessage();
                Greenfoot.delay(1800);
                Depict dp=new Depict();
                dp.display("Next Level",this);
                
                Greenfoot.start();
                
                
                
           levelContext.setLevel(levelContext.nextLevel());
          //Levels level2=new Level2();
           //levelContext.setLevel(level2);
           levelContext.getLevel().setTimerLevel();
           timer=levelContext.getLevel().getTimer();
        }else{
            Greenfoot.stop();
        }
            
        }
        }
    
    
        if(z==true){
        if(Greenfoot.getRandomNumber(300) < 3) {
            xc=Greenfoot.getRandomNumber(600);
            if(xc>=20 && xc<=580)           // so that candy does'nt go out of the screen
            {
                x=Greenfoot.getRandomNumber(5);                 
              switch(x)
              {           
                case 0:
                  addObject(new Poison(), xc, 500);
                    //break;
                case 1:
                  addObject(CandyStore.create(CandyType.MILKYWAY),xc, 500);
                  break;
                case 2:
                  addObject((CandyStore.create(CandyType.TWIX)),xc, 500);
                  break;
                case 3:
                  addObject((CandyStore.create(CandyType.SNICKERS)),xc, 500);
                  break;
                case 4:
                  Gems b = (Gems)CandyStore.create(CandyType.GEMS);
                  b.addChildren(this);
                 // System.out.println("Loop value " + this);
                  addObject(b,xc, 500);
                  break;
              }
              if((num.getValue()>0 && num.getValue()%200==0) && num3==0 )
              {
                num3=1;
                addObject(ExtraPoints.create(ExtraPointType.TWICE), xc,500);
              }

            }   
            
            if((num.getValue()>0 && num.getValue()%200!=0 && num.getValue()%100==0) && num1==0 )
              {
                num1=1;
                addObject(ExtraPoints.create(ExtraPointType.ADDITIONAL), 0,Greenfoot.getRandomNumber(500));
              }
        }
    }
    }
    public void num(int score, CandyPanda fn)
    {
      num3=0;
      num1=0;
     // System.out.println("Adding"+score);
      num.add(score);      //score on the screen being incremented
      s = new Points();   
      s.addScore(score,fn);       //score on final display
    }
    
    
    
    public void getNextLevelMessage(){
        
        
        
        
    }

    public void endGame() 
    {
        removeObject(num);
        addObject(new EndGame(), 300, 250);
        addObject(new PointBoard(s.getScore()), getWidth()/2, getHeight()/2);
        s.setScore(0);
       // Greenfoot.playSound("remove.wav");
        Greenfoot.stop();
        game.setReset(0);
    }


    public void populate()
    {
        addObject(num, 100, 460);
         addObject(timerText, 100, 15);
    }
    
    public void addObjectFromActor(Candy f, int a, int b)
    {
        addObject(f,a,b);
    }
    
}
