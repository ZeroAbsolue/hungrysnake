package com.example;

public class Viande {
    Airedejeu airedejeu;

    public Viande(Airedejeu airedejeu) {
        this.airedejeu = airedejeu;
    }

    /*
     * Methode permettant de generer aleatoirement la position d'une viande sur l'aire
     * de jeu
     */
    public Cellule nouvellePosition() {
        Cellule cellule = new Cellule((int) Math.floor(Math.random() * airedejeu.nombreLigne),
                (int) Math.floor(Math.random() * airedejeu.nombreLigne));

        if (cellule.ligne == 0)
            cellule.ligne++;
        if (cellule.colonne == 0)
            cellule.colonne++;

        return cellule;
    }

}
