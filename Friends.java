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
        System.out.println("My Coords are: X: "+myCoordsX+" Y: "+myCoordsY);
        System.out.println("Your Coords are: X: "+playerCoordsX+" Y: "+playerCoordsY);
        //giveHomework();
    } 
    public int giveHomework(){
        /* for(int n = 0; n>150;n++){
        if(myCoordsX == playerCoordsX -n | myCoordsX == playerCoordsX +n){
         for(int y = 0; y>150; y++){
             if(myCoordsY == playerCoordsY +n | myCoordsY == playerCoordsY -n){*/
                         System.out.println("Hi");
               System.exit(0);
               i = 1;
              /*  }
            }

     }
    }*/
    return i;
 }
}
