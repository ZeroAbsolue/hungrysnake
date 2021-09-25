package com.example;

/* Cette classe permet d'identifier une cellule dans une aire de jeu */
public class Cellule {

    public Integer ligne;
    public Integer colonne;

    public Cellule(int ligne, int colonne) {
        super();
        this.ligne = ligne;
        this.colonne = colonne;
    }


    @Override
    public String toString() {
        return "{" +
            " ligne ='" + ligne + "'" +
            ", colonne ='" + colonne  + "'" +
            "}";
    }
    
}
