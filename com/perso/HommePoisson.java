package com.perso;

public class HommePoisson extends Pirate{
    public HommePoisson(String name) throws PirateException{
        // this.name = name;
        // this.posX = 30;
        // this.posY = 30;
        super(name); // récupère les attributs et les méthodes qui sont sur la classe supérieure
        this.posZ = 30;
    }

    // public void move(int x, int y, int z)
    // {
    //     this.posX = x;
    //     this.posY = y;
    //     this.posZ = z;
    //     System.out.println("Le pirate se déplace en X:" + this.posX + " en Y:" + this.posY + " et en Z: " + this.posZ);
    // }

    // public void move(int x, int y)
    // {
    //     super.move(x,y);
    //     System.out.println("L homme poisson se déplace en X:" + this.posX + " en Y:" + this.posY);
    // }

    public void swim(int x, int y, int z){
        this.posZ =z;
        move(x,y); // on ne met pas super ici car super n'est que pour la redéfinition, ici on ne fait qu'utiliser move()
        System.out.println("L homme poisson se déplace en X:" + this.posX + " en Y:" + this.posY + " et en Z: " + this.posZ);
    }
    // private String name;
    // private int posX;
    // private int posY;
    protected int posZ;
}
// méthode swim appelle le move