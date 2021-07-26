import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemigo extends plataformas
{
    int numero = 10;
    /**
     * Act - do whatever the enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int getRandomNumbers(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    public void act()
    {
        setLocation(getX()+2, getY());
    
        if (getX()==516)
        {
            setLocation(0,getRandomNumbers(0,1216));
        }
        if (numero == 10)
        {
            setImage("enemigo1.png");
            numero = 0;
            
        }else{
            setImage("enemigo2.png");
            numero++;
        
        }
        
        }
    }
    
    