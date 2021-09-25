package com.example;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CelluleTest {
    int ligne = 7;
    int colonne = 6;
    Cellule cellule;

    @Before
    public void initiation() {
        cellule = new Cellule(ligne, colonne);
    }

    @Test
    public void constructorTest() {
        assertEquals(ligne, (int)cellule.ligne);
        assertEquals(colonne, (int)cellule.colonne);
    }

}
