package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CelluleTest {
    int ligne = 7;
    int colonne = 6;
    Cellule cellule;

    @BeforeEach
    public void initiation() {
        cellule = new Cellule(ligne, colonne);
    }

    @Test
    public void constructorTest() {
        assertEquals(ligne, cellule.ligne);
        assertEquals(colonne, cellule.colonne);
    }

}
