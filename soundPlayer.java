import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class soundPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class soundPlayer extends Actor
{
    boolean running = false;
    boolean stop = true;
    private GreenfootSound bossfight = new GreenfootSound("boss_battle_#2.mp3");
    /**
     * Act - do whatever the soundPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       play("bossfight");
    }    
    
    public void play(String sound){
        if(running == true && stop == true){
          stopAll();
        }
        if(running == false && sound == "bossfight"){
            bossfight.play();
            running = true;
        }
    }
    public void stopAll(){
        bossfight.stop();
        running = false;
    }
            protected void addedToWorld(World world)
    {

        setImage("images/void.PNG");
        world = getWorld();

    }
    
}
