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
    boolean mute = false;
    String toPlay = "bossfight";
    private GreenfootSound bossfight = new GreenfootSound("boss_battle_#2.mp3");
    private GreenfootSound bgm = new GreenfootSound("background.mp3");
    /**
     * Act - do whatever the soundPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        toPlay = "bgm";
        if(running == false) play(toPlay);
        if (Greenfoot.mouseClicked(this)) {
            if(mute == true){
                mute = false;
                setImage("images/speaker_active.png");
                play(toPlay);
            }
            else{
              mute = true;
              setImage("images/speaker_inactive.png");
              stopAll();
            }
        }
    }    
    
    public void play(String sound){
        
        if(running == true && stop == true){
          stopAll();
        }
        if(mute != true){
        if(running == false && sound == "bossfight"){
            bossfight.play();
            running = true;
        }
        if(running == false && sound == "bgm"){
            bgm.playLoop();
            running = true;
        }
      }
    }
    public void stopAll(){
        bossfight.stop();
        bgm.stop();

        running = false;
    }
            protected void addedToWorld(World world)
    {
        
        setImage("images/speaker_active.png");
        world = getWorld();

    }
    
}
