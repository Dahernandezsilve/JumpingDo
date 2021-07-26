import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pruebamundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pruebamundo extends SWorld
{
    Contador cont = new Contador();
    public int tamaño;
    /**
     * Constructor for objects of class Pruebamundo.
     * 
     */
    int c = 64;
    int playerx;
    int playery;
    GreenfootSound cancion = new GreenfootSound("inicio.mid");
    public int getRandomNumbers(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    public Pruebamundo()
    {    
        
        super(512, 896, 1, 512,896); 
        prepare();
        setMainActor(new Wazius(), 250, 350);
        mainActor.setLocation(4*c, 11*c);
        GreenfootImage bg = new GreenfootImage("Fondo.png");
        setScrollingBackground(bg); 
        if (! getObjects(plataformablue.class).isEmpty()){
            Actor plataformablue = getObjects(plataformablue.class).get(0);
            playery = plataformablue.getY();
        }
        addObject(new plataformablue(), 6*c, 14*c);
        addObject(new plataformablue(), 2*c, 15*c);
        addObject(new plataformablue(), 4*c, 12*c);
        addObject(new plataformablue(), 6*c, 10*c);
        addObject(new plataformablue(), 4*c, 5*c);
        addObject(new plataformablue(), 3*c, 6*c);
        addObject(new plataformablue(), 5*c, 9*c);
        addObject(new plataformablue(), 2*c, 7*c);
        addObject(new plataformablue(), 6*c, 4*c);
        if (playery == 0 ){
            addObject(new plataformablue(), getRandomNumbers(64,448), 0);
        }
        addObject(new bordederecho(), 8*c, 11*c);
        addObject(new bordederecho(), 8*c, 0*c);
        addObject(new bordederecho(), 8*c, 9*c);
        addObject(new bordederecho(), 8*c, 7*c);
        addObject(new bordederecho(), 8*c, 5*c);
        addObject(new bordederecho(), 8*c, 3*c);
        addObject(new bordederecho(), 8*c, 15*c);
        addObject(new bordeizquierdo(), 0*c, 11*c);
        addObject(new bordeizquierdo(), 0*c, 9*c);
        addObject(new bordeizquierdo(), 0*c, 7*c);
        addObject(new bordeizquierdo(), 0*c, 5*c);
        addObject(new bordeizquierdo(), 0*c, 3*c);
        addObject(new bordeizquierdo(), 0*c, 15*c);
        addObject(new enemigo(), 0*c, 10*c);
        addObject(new enemigo(), 0*c, 5*c);
        addObject(new enemigo(), 0*c, 7*c);
        addObject(new basemuerte(), 4*c, 14*c);
        addObject(new Monedas(), 4*c, 5*c);
        
    }
    public void prepare()
    {
        addObject(cont, 2*c, 1*c);
    }
    public Contador getCounter()
    {
        return cont;
    }

    public void act()
    {
        cancion.playLoop();
        cancion.setVolume(20);
    }

    public void agregarNuevoItem(){
        int x = getRandomNumbers(64,448);
        int y = getRandomNumbers(0,800);
        Monedas item = new Monedas();
        addObject(item, x, y);
        
    }
}

  
