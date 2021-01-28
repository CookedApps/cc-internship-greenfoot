import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    String name = "";
    soundPlayer spr;
    boolean alrr = false;
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImg();
        playSong();
    } 
    public void enemy(){
        name = "";
    }
    public void playSong(){
      if(name == "nolde" && alrr == false){
        MyWorld.spr.play("nolde");
        alrr = true;
    } 
    }
    public void setImg(){
              if(name == "nolde"){
        setImage("images/nolde.PNG");
    }  
    }
}
