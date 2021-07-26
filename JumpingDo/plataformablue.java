import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plataformablue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class plataformablue extends plataformas
{
    
    public int getRandomNumbers(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    public plataformablue()
    {
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/3);    
    }
    /**
     * Act - do whatever the plataformablue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+2);
    
        if (getY()==1216)
        {
            setLocation(getRandomNumbers(64,448),0);
        }
    }
}
