import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemigof here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemigof extends Actor
{
    int numero = 10;
    /**
     * Act - do whatever the enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        if (numero == 10)
        {
            setImage("enemigo1.png");
            move(10);
            numero = 0;
            
        }else{
            setImage("enemigo2.png");
            numero++;
        
        }
        setLocation(getX(), getY());
    
        if (getX()==516)
        {
            setLocation(0,getRandomNumbers(0,1216));
        }
    }
    public int getRandomNumbers(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    // Add your action code here.
    }

