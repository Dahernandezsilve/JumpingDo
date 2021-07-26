import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends SWorld
{
    

    /**
     * Constructor for objects of class Menu.
     * 
     */
    int c = 64;
    
    GreenfootSound cancion = new GreenfootSound("accion.mid");    
    public Menu()
    
    {    
        
        super(512, 896, 1, 512,4096); 
        setMainActor(new Wazius(), 250, 300);
        mainActor.setLocation(4*c, 11*c);
        GreenfootImage bg = new GreenfootImage("Menu.png");
        setScrollingBackground(bg); 
        addObject(new plataformablue(), 4*c, 12*c );
        addObject(new JumpingDo(), 4*c, 5*c );
        addObject(new Start(), 4*c, 8*c);
        addObject(new Enter(), 4*c, 9*c);
    
       
    }
    public void act()
    {
        cancion.playLoop();
        cancion.setVolume(20);
        if (Greenfoot.isKeyDown("enter"))
        {
            cancion.stop();
            Greenfoot.setWorld(new Pruebamundo());
        }
    }
}

