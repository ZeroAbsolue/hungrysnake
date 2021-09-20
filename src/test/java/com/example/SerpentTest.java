package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SerpentTest {
    Serpent serpent;
    Cellule cellule;
    Cellule cellule2;
    Cellule cellule3;
    Cellule cellule4;
    Cellule cellule5;

    @BeforeEach
    public void setup() {
        cellule = new Cellule(4, 4);
        cellule2 = new Cellule(4, 5 );
        cellule3 = new Cellule(3, 5);
        cellule4 = new Cellule(3, 4);
        cellule5 = new Cellule(2, 4);
        serpent = new Serpent(cellule);

        // serpent.manger(cellule2,Action.AUCUN);
        // serpent.deplacer(Action.DROITE);
        // serpent.manger(cellule3,Action.AUCUN);
    }

    @Test
    public void constructorTest() {
        serpent.manger(cellule2,Action.DROITE);
        assertEquals(Action.DROITE, serpent.corps.get(0).action);
        assertEquals(Action.AUCUN, serpent.corps.get(1).action);
        serpent.manger(cellule3,Action.MONTER);
        assertEquals(Action.DROITE, serpent.corps.get(0).action);
        assertEquals(Action.MONTER, serpent.corps.get(1).action);
        assertEquals(Action.AUCUN, serpent.corps.get(2).action);
        serpent.manger(cellule4,Action.GAUCHE);
        assertEquals(Action.DROITE, serpent.corps.get(0).action);
        assertEquals(Action.MONTER, serpent.corps.get(1).action);
        assertEquals(Action.GAUCHE, serpent.corps.get(2).action);
        assertEquals(Action.AUCUN, serpent.corps.get(3).action);
        serpent.manger(cellule5,Action.MONTER);
        assertEquals(Action.DROITE, serpent.corps.get(0).action);
        assertEquals(Action.MONTER, serpent.corps.get(1).action);
        assertEquals(Action.GAUCHE, serpent.corps.get(2).action);
        assertEquals(Action.MONTER, serpent.corps.get(3).action);
        assertEquals(Action.AUCUN, serpent.corps.get(4).action);
        serpent.deplacer(Action.DROITE);
        assertEquals(Action.MONTER, serpent.corps.get(0).action);
        assertEquals(Action.GAUCHE, serpent.corps.get(1).action);
        assertEquals(Action.MONTER, serpent.corps.get(2).action);
        assertEquals(Action.DROITE, serpent.corps.get(3).action);
        assertEquals(Action.AUCUN, serpent.corps.get(4).action);
    }

    // @Test
    // public void allerDroiteTest() {
    // serpent.allerADroite();
    // cellule.colonne++;
    // assertEquals(cellule, serpent.tete);
    // }

    // @Test
    // public void allerGaucheTest() {
    // serpent.allerAGauche();
    // cellule.colonne--;
    // assertEquals(cellule, serpent.tete);
    // }

    // @Test
    // public void monterTest() {
    // serpent.monter();
    // cellule.ligne--;
    // assertEquals(cellule, serpent.tete);
    // }

    // @Test
    // public void descendreTest() {
    // serpent.descendre();
    // cellule.ligne++;
    // assertEquals(cellule, serpent.tete);
    // }

    // @Test
    // public void mangerTest() {
    // serpent.manger(new Cellule(4, 5));
    // assertEquals(cellule, serpent.tete);
    // }
}
