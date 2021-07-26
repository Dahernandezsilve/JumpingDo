import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wazius here.
 * Universidad del Valle de Guatemala
 * Nombre: Diego Alexander Hernández Silvestre Carné: 21270
 * Proyecto: Jumping Do
 * @author (DiegoHernández;)) 
 * @version (Version 0.001 / 22/07/2021)
 */
public class Wazius extends Jugadores
{
    //Variables principales
    private int speed = 7;
    private int vSpeed = 0;
    private int acceleration = 2; 
    private int jumpsStrengh = 30;
    private boolean onGround;
    
    
    GreenfootSound cancion = new GreenfootSound("inicio.mid");
    public void act()
    {
        //if (Greenfoot.isKeyDown("space") && getY() > getWorld().getHeight()-50)jump();
        checkKeys();
        verticalmovement();
        horizontalmovement();
        perdiste();
    }
    //Animación
    private void checkKeys(){
        if (Greenfoot.isKeyDown("A"))
        {
            setImage("Left_Waziusp2.png");
            moveLeft();
        }
        if (Greenfoot.isKeyDown("D"))
        {
            setImage("Right_Waziusp1.png");
            moveRight();
        }
        if (Greenfoot.isKeyDown("space"))
        {
            jump();   
        }
        
        Actor Monedas;
        Monedas=getOneObjectAtOffset(0,0,Monedas.class);
        if (Monedas != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Monedas);
            ((Pruebamundo)getWorld()).agregarNuevoItem();
            Pruebamundo mundo = (Pruebamundo)world;
            Contador cont = mundo.getCounter();
            cont.addcontar();
        }
    }
    private void horizontalmovement(){
        while (getOneObjectAtOffset (getImage().getWidth()/2, 0, plataformas.class) != null)
        {
            setLocation(getX()-1, getY());

            speed = 0;
        }
        speed = 7;
        while (getOneObjectAtOffset (-getImage().getWidth()/2, 0, plataformas.class) != null)
        {
            setLocation(getX()+1, getY());

            speed = 0;
        }
        speed = 7;
        while (getOneObjectAtOffset (getImage().getWidth()/2, 0, enemigo.class) != null)
        {
            setLocation(getX()-1, getY());

            speed = 0;
        }
        speed = 7;
        while (getOneObjectAtOffset (-getImage().getWidth()/2, 0, enemigo.class) != null)
        {
            setLocation(getX()+1, getY());

            speed = 0;
        }
        speed = 7;
    }
    //Movimiento vertical que permite la colisión del actor con las plataformas.
    private void verticalmovement(){
        vSpeed ++;
        setLocation(getX(), getY()+vSpeed/2);
        onGround = false;
        
        //Plataformas
        while(getOneObjectAtOffset (14, getImage().getHeight()/2-2, plataformablue.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            vSpeed = 0;
        }
        while (getOneObjectAtOffset (14, getImage().getHeight()/2 - 2, plataformablue.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            vSpeed = 0;
        }

        while (getOneObjectAtOffset (-14, getImage().getHeight()/2 - 1, plataformablue.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            vSpeed = 0;
        }

        while (getOneObjectAtOffset (0, -getImage().getHeight()/2+1, plataformablue.class)!= null)
        {
            setLocation(getX(), getY()+1);
            onGround = true;
            vSpeed = 0;
        }  
        
        while(getOneObjectAtOffset (14, getImage().getHeight()/2-2, enemigo.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            vSpeed = 0;
        }
        while (getOneObjectAtOffset (14, getImage().getHeight()/2 - 2, enemigo.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            vSpeed = 0;
        }

        while (getOneObjectAtOffset (-14, getImage().getHeight()/2 - 1, enemigo.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            vSpeed = 0;
        }

        while (getOneObjectAtOffset (0, -getImage().getHeight()/2+1, enemigo.class)!= null)
        {
            setLocation(getX(), getY()+1);
            onGround = true;
            vSpeed = 0;
        }  

    }        
    
    public void perdiste(){  
        Actor enemigof = getOneObjectAtOffset(-getImage().getWidth()/2, 0, enemigo.class);
        if (enemigof != null){
            Greenfoot.setWorld(new perder());
        }
        Actor enemigof1 = getOneObjectAtOffset(getImage().getWidth()/2, 0, enemigo.class);
        if (enemigof1 != null){
            Greenfoot.setWorld(new perder());
        }
        Actor enemigof2 = getOneObjectAtOffset(0,getImage().getHeight()/2, enemigo.class);
        if (enemigof2 != null){
            Greenfoot.setWorld(new perder());
        }
        Actor enemigof3 = getOneObjectAtOffset(0, -getImage().getHeight()/2, enemigo.class);
        if (enemigof3 != null){
            Greenfoot.setWorld(new perder());
        }
        
        Actor bkill0 = getOneObjectAtOffset(-getImage().getWidth()/2, 0, basemuerte.class);
        if (bkill0 != null){
            Greenfoot.setWorld(new perder());
        }
        Actor bkill1 = getOneObjectAtOffset(getImage().getWidth()/2, 0, basemuerte.class);
        if (bkill1 != null){
            Greenfoot.setWorld(new perder());
        }
        Actor bkill2 = getOneObjectAtOffset(0,getImage().getHeight()/2, basemuerte.class);
        if (bkill2 != null){
            Greenfoot.setWorld(new perder());
        }
        Actor bkill3 = getOneObjectAtOffset(0, -getImage().getHeight()/2, basemuerte.class);
        if (bkill3 != null){
            Greenfoot.setWorld(new perder());
        }
    }
    //public boolean onGround(){
    //    Actor under = getOneObjectAtOffset (1, getImage().getHeight() /1, plataformablue.class);
    //    return under != null;
    //}
    //Efecto que da la gravedad
    public void fall(){
        setLocation (getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
     }
    //Movimiento a la derecha
    private void moveRight(){
        setLocation(getX() + speed, getY());
    }
    //Movimiento a la izquierda
    private void moveLeft(){
        setLocation(getX() - speed, getY());
    }
    //Capacidad de saltar sin volar. 
    private void jump(){
        if(onGround == true){
        vSpeed = -jumpsStrengh;
        fall();
    }
    }
    //public boolean encontroItem() {
    //    Monedas item = getOneObjectAtOffset(0,0, Monedas.class);
    //    return item !=null;     
    }
    
    //public void jump() {
    //    velocity = -20;
    //}
    /////////////////////////////////////////////////////////////////////////////////
    //private final int gravity = 1;
    //private int velocity;
    //public Jumper(){
    //    velocity = 4;
    //}
    //Colision de bloques
   
    
    
    //Gravedad
    //public void fall(){
    //    setLocation(getX(),getY() + velocity);
     //   if (getY() > getWorld().getHeight()-50) velocity = 0;
       // else velocity += gravity;

    //Salto
    
    //Movimiento horizontal y vertical
    //public void move(){
   //     int x=getX();
   //     int y=getY();
   //     if (Greenfoot.isKeyDown("A"))x=x-10; // Izquierda
   //     if (Greenfoot.isKeyDown("D"))x=x+10; // Derecha
   //     setLocation(x,y);
    //}

