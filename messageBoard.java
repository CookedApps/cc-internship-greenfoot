import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class messageBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class messageBoard extends Actor
{
    public void messageBoard(){
            setImage("images/msgboard.png");
            //test
    }
    /**
     * Act - do whatever the messageBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        printOut("*insert Megalovania at this point");
    }
    public void printOut(String toDraw){
               
        reload();
                    
                    
        this.getImage().setColor(Color.WHITE);
        this.getImage().setFont(new Font("Verdana",false,false,25));
        getImage().drawString(toDraw,50,60);
                    
    }
    protected void addedToWorld(World world)
    {

        setImage("images/msgboard.png");
        world = getWorld();

    }
    public void reload(){
        this.getImage().clear();
        this.setImage("images/msgboard.png");
    }
}
