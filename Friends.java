import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Friends here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Friends extends Actor
{
    Character character;
    int myCoordsX;
    int myCoordsY; 
    int playerCoordsX;
    int playerCoordsY;
    int i;
    public Friends(){
        //setImage("images/Homework3.png");
        setImage("images/karnekiundha.png");
    }
    /**
     * Act - do whatever the Friends wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        myCoordsX = getX();
        myCoordsY = getY();
        playerCoordsX = MyWorld.character.getX();
        playerCoordsY = MyWorld.character.getY();
    } 
    public int giveHomework(){
        for(int n = 0; n>50;n++){
        if(myCoordsX == playerCoordsX -n | myCoordsX == playerCoordsX +n && myCoordsY == playerCoordsY -n | myCoordsY == playerCoordsY -n){
        i = 1;
     }
    }
    return i;
 }
}
