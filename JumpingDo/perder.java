import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class perder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class perder extends SWorld
{
    /**
     * Constructor for objects of class perder.
     * 
     */
    int c = 64;
    public perder()
    {
        super(512, 896, 1, 512, 896);
        setMainActor(new Wazius(), 250, 350);
        mainActor.setLocation(4*c, 11*c);
        GreenfootImage bg = new GreenfootImage("perdisteb.png");
        setScrollingBackground(bg); 
    }
}
