package com.perso;

public class Combattant extends EtreVivant {
    public Combattant(){
        name = "Combattant";
    }

    public void respirer(){
        System.out.println("combattant respire normalement!");
    }

    @Override
    public void vivre() {
       System.out.println("Je pense donc je suis");
    }
}
