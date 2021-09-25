package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AiredejeuTest {
    int nombreLigne = 7;
    int nombreColonne = 7;
    Airedejeu airedejeu;

    @Before
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
        assertEquals(nombreLigne * nombreColonne, (int)airedejeu.getNombreDeCellule());
    }

    @Test
    public void limiteTest() {
        assertEquals(nombreLigne * nombreColonne, (int)airedejeu.getNombreDeCellule());
    }

    @Test
    public void centreTest() {
        Cellule cellule = new Cellule(3, 3);
        assertEquals(cellule.colonne, airedejeu.centre().colonne);
        assertEquals(cellule.ligne, airedejeu.centre().ligne);
    }

    @Test
    public void toStringTest() {
        assertEquals( " Aire de jeu {" +
            " nombre Ligne='" + nombreLigne + "'" +
            ", nombre Colonne='" + nombreColonne + "'" +
            ", nombre Cellule='" + nombreLigne*nombreColonne + "'" +
            "}",airedejeu.toString());
    }
}
