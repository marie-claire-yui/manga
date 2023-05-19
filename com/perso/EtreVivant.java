package com.perso;

import java.sql.Date;
// une classe abstraite 
//      - doit avoir au minimum une méthode abstraite
//      - n'a pas de getters et de setters
//      -oblige les enfants a utiliser (implémenter) les méthodes abstraites 

public abstract class EtreVivant {
    protected String name;

    public String kezako()
    {
        return name;
    }

    public abstract void vivre();
    public abstract void respirer();

    public void naitre(Date date){
        System.out.println("je suis née le :" + date);
    }
}
// classe abstraite permet de définir
// doit au minimum avoir une méthode abstraite qu'on ne va pas implémenter (pas de corps dans la méthode, pas d'isntructions)
// la classe abstraite permet juste d'exister
// classe abstraite ne peut pas avoir d'instance
// on n'utilise pas de getters et de setters dans une classe abstraite
// une méthode abstraite n'est pas implémentable
// il faut au moins une méthode abstraite dans une classe abstraite
// il peut aussi exister une ou des méthodes concrètes dans une classe abstraite
// c'est la classe enfant qui doit implémenter une méthode abstraite de la classe mère (elle doit le faire obligatoirement)