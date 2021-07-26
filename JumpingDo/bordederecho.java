import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bordederecho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bordederecho extends plataformas
{
    public int getRandomNumbers(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    /**
     * Act - do whatever the bordederecho wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
