package com.perso;

public class HommePoisson extends Pirate{
    public HommePoisson(String name){
        // this.name = name;
        // this.posX = 30;
        // this.posY = 30;
        super(name);
        this.posZ = 30;
    }

    // public void move(int x, int y, int z)
    // {
    //     this.posX = x;
    //     this.posY = y;
    //     this.posZ = z;
    //     System.out.println("Le pirate se déplace en X:" + this.posX + " en Y:" + this.posY + " et en Z: " + this.posZ);
    // }

    public void swim(int z){
        this.posZ =z;
        System.out.println("L homme poisson se déplace en X:" + this.posX + " en Y:" + this.posY + " et en Z: " + this.posZ);
    }
    // private String name;
    // private int posX;
    // private int posY;
    private int posZ;
}
