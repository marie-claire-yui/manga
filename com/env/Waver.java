package com.env;

public class Waver extends Vehicule{
    int posiX;
    int posiY;

    public Waver(int positionX, int positionY)
    {
        this.posiX = positionX;
        this.posiY = positionY;
    }

    public void deplacer(int x, int y){
        this.posiX = x;
        this.posiY = y;
        System.out.println("Je me déplace dans l'eau entre les îlots en coordonnées x et y: "+ this.posiX+","+this.posiY);
    }
}


// package com.env;

// public class Waver extends Vehicule{
//     public Waver()
//     {
//         this.speed = "Noeud";
//     }

//     public void deplaceXY(int x, int y)
//     {
//         System.out.println("Le Waver se deplace en X:" + x + " et en Y : " + y);
//     }
// }
