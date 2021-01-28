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
    boolean mute = true;
    boolean start = false;
    String toPlay = "bgm";
    String lastPlay = "bgm";
    //lehrerthemes
    private GreenfootSound bossfight = new GreenfootSound("boss_battle_#2.mp3");
    private GreenfootSound bgm = new GreenfootSound("background.mp3");
    private GreenfootSound watzi = new GreenfootSound("watzlawek.mp3");
    private GreenfootSound westerman = new GreenfootSound("westerman.mp3");
    private GreenfootSound nolde = new GreenfootSound("nolde.mp3");
    private GreenfootSound nagel = new GreenfootSound("nagel.mp3");
    private GreenfootSound krey = new GreenfootSound("krey.mp3");
    private GreenfootSound euman = new GreenfootSound("euman.mp3");
    private GreenfootSound mergard = new GreenfootSound("mergard.mp3");
    private GreenfootSound quadflieg = new GreenfootSound("quadflieg.mp3");
    private GreenfootSound nachtkamp = new GreenfootSound("nachtkamp.mp3");
    //sfx
    
    /**
     * Act - do whatever the soundPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(toPlay != lastPlay | start == false){
        if(running == false) play(toPlay);
        start = true;
     }
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
        
        if(running == true){
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
        if(running == false && sound == "watzi"){
            watzi.play();
            running = true;
        }
                if(running == false && sound == "westerman"){
            westerman.play();
            running = true;
        }
                if(running == false && sound == "nolde"){
            nolde.play();
            running = true;
        }
                if(running == false && sound == "nagel"){
            nagel.play();
            running = true;
        }
                if(running == false && sound == "krey"){
            krey.play();
            running = true;
        }
                if(running == false && sound == "euman"){
            euman.play();
            running = true;
        }
                        if(running == false && sound == "mergard"){
            mergard.play();
            running = true;
        }
                        if(running == false && sound == "quadflieg"){
            quadflieg.play();
            running = true;
        }
                        if(running == false && sound == "nachtkamp"){
            nachtkamp.play();
            running = true;
        }
      }
    }
    public void sfxPlay(String whichOne){
        
    }
    public void stopAll(){
        bossfight.stop();
        bgm.stop();
        watzi.stop();
        westerman.stop();
        nolde.stop();
        nagel.stop();
        krey.stop();
        euman.stop();
        running = false;
    }
            protected void addedToWorld(World world)
    {
        
        setImage("images/speaker_active.png");
        world = getWorld();

    }
    
}
