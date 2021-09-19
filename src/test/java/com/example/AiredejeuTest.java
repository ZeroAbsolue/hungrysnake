package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AiredejeuTest {
    int nombreLigne = 7;
    int nombreColonne = 7;
    Airedejeu airedejeu;

    @BeforeEach
    public void initialisation() {

        airedejeu = new Airedejeu(nombreLigne, nombreColonne);
    }

    @Test
    public void constructorTest() {
        assertEquals(nombreLigne, airedejeu.nombreLigne);
        assertEquals(nombreColonne, airedejeu.nombreColonne);
    }

    @Test
    public void nombreDeCelluleTest() {
        assertEquals(nombreLigne * nombreColonne, airedejeu.getNombreDeCellule());
    }

    @Test
    public void limiteTest() {
        assertEquals(nombreLigne * nombreColonne, airedejeu.getNombreDeCellule());
    }

    @Test
    public void centreTest() {
        Cellule cellule = new Cellule(3, 3);
        assertEquals(cellule.colonne, airedejeu.centre().colonne);
        assertEquals(cellule.ligne, airedejeu.centre().ligne);
    }
}
