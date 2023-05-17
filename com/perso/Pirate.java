package com.perso;

public class Pirate {
    public Pirate(String name){
        this.name = name;
        this.posX = 30;
        this.posY = 30;
    }

    public void move(int x, int y)
    {
        this.posX = x;
        this.posY = y;
        System.out.println("Le pirate se déplace en X:" + this.posX + " et en Y:" + this.posY);
    }

    public String name;
    public int posX;
    public int posY;
}
