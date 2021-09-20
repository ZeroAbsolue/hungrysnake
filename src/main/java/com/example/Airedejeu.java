package com.example;

/* Cette classe permet de definit une aire de jeu */
public class Airedejeu {
    int nombreLigne;
    int nombreColonne;

    public Airedejeu(int nombreLigne, int nombreColonne) {
        this.nombreLigne = nombreLigne;
        this.nombreColonne = nombreColonne;
    }

    /*
     * Cette methode permet de determiner le nombre de cellule que contient une aire
     * de jeu
     */
    public Integer getNombreDeCellule() {
        return nombreLigne * nombreColonne;
    }

    /* Permet de determine le centre d'une aire de surface */
    public Cellule centre() {
        return new Cellule((int)Math.floor(nombreLigne/2),(int) Math.floor(nombreColonne/2));
    }



    @Override
    public String toString() {
        return " Aire de jeu {" +
            " nombre Ligne='" + nombreLigne + "'" +
            ", nombre Colonne='" + nombreColonne + "'" +
            ", nombre Cellule='" + nombreLigne*nombreColonne + "'" +
            "}";
    }

}
