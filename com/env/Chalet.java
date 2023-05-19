package com.env;

public class Chalet extends Construction{
    public Chalet(){
        this.nbrPlaces = 3;
    }
    public void materiaux(){
        System.out.println("Je suis un abri de montagne");
    }
}

// package com.env;

// public class Chalet extends Construction
// {
//     public Chalet()
//     {
//         this.nbrPieces = 3;
//     }

//     public void setNbrPieces(int nbr)
//     {
//         this.nbrPieces += nbr;
//     }
//     public int getNbrPieces()
//     {
//         return nbrPieces;
//     }

//     public void materiaux(String mat)
//     {
//         System.out.println("Le chalet est construit en : " + mat);
//     }
// }
