import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timer extends Actor
{
    messageBoard mb1;
    /**
     * Act - do whatever the timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        countDown(100);
    }    
    public void countDown(int TimeInSeconds){
        try{
        for(int m = 0; m < TimeInSeconds; m++){
            mb1.displayCounter(m);
            Thread.sleep(100);
        }
    }catch(InterruptedException ie) 
    {
    }
    
 }
}