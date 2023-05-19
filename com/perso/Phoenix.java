package com.perso;

public final class Phoenix extends HommePoisson{ // mot clé final pour éviter que phoenix soit extends
    public Phoenix(String name) throws PirateException{
        super(name); // récupère les attributs et les méthodes qui sont sur la classe supérieure
    }

    public void fly(int x, int y, int z){
        //this.posZ =z;
       // move(x,y); // on ne met pas super ici car super n'est que pour la redéfinition, ici on ne fait qu'utiliser move()
        
       super.swim(x,y,z); // super ici n'est pas nécessaire
        System.out.println("Le phoenix se déplace en X:" + this.posX + " en Y:" + this.posY + " et en Z: " + this.posZ);
    }
}
