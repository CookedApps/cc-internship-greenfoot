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
    /**
     * Act - do whatever the soundPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(running == false){
        play("sounds/boss_battle_#2.mp3");
     }
    }    
    
    public void play(String sound){
        Greenfoot.playSound(sound);
        running = true;
    }
    public void stop(){
        Greenfoot.stop();
        running = false;
    }
            protected void addedToWorld(World world)
    {

        setImage("images/hoffmann.PNG");
        world = getWorld();

    }
    
}
