import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startScreen extends Actor
{
    boolean visible = true;
    /**
     * Act - do whatever the startScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            visible = false;
        }
        if(visible = true){
            setImage("startscreen.jpg");
        }
        else{
            setImage("void.PNG");
        }
    } 
        protected void addedToWorld(World world)
    {

        setImage("images/startscreen.jpg");
        world = getWorld();

    }
}
