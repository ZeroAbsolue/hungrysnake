package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public  void testApp() {
        int nombreLigne = 4;
        int nombreColonne = 4;
        Airedejeu airedejeu = new Airedejeu(nombreLigne, nombreColonne);
        System.out.println(airedejeu);

        Serpent serpent = new Serpent(new Cellule(airedejeu.centre().ligne, airedejeu.centre().colonne));
        System.out.println(serpent);

        Viande viande = new Viande(airedejeu);
        Cellule cellule = new Cellule(1, 1);
        viande = mock(Viande.class);
        when(viande.nouvellePosition()).thenReturn(cellule);
        assertEquals(cellule, viande.nouvellePosition());
        System.out.println("viande " + viande.nouvellePosition());

        serpent.monter();
        serpent.allerAGauche();

        // assertEquals(cellule, serpent.tete);
        System.out.println(serpent);

        // assertEquals(cellule, airedejeu.centre());
    }
}
