import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class speaker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class speaker extends Actor
{
    boolean act = false;
    soundPlayer spr;
    /**
     * Act - do whatever the speaker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
            if (mi != null)
            {
      int buttonNumber = mi.getButton();
        if (buttonNumber == 3)
        {
        //whatever I want it to do
    
         if(act == true){
            spr.running = true;
         }        
         if(act == false){
            spr.running = false;
         }
        }
      }
    }
        protected void addedToWorld(World world)
    {

        setImage("images/speaker_active.png");
        world = getWorld();

    
    }
}
