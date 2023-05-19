package com.env;

public class Bateau extends Vehicule {
int posiX;
int posiY;

    public Bateau(int positionX, int positionY)
    {
        this.posiX = positionX;
        this.posiY = positionY;
    }

    public Bateau()
    {
        this.posiX = 0;
        this.posiY = 0;
        this.speed = "Noeud";
    }

   
    

    public void deplacer(int x, int y){
        this.posiX =  x;
        this.posiY =  y;
        System.out.println("Je me déplace dans la mer et les océans en coordonnées x et y: "+ this.posiX+","+this.posiY);
    }


    
}
