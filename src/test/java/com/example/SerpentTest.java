package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SerpentTest {
    Serpent serpent;
    Cellule cellule;
    Cellule cellule2;
    Cellule cellule3;
    Cellule cellule4;
    Cellule cellule5;

    @Before
    public void setup() {
        cellule = new Cellule(4, 4);
        cellule2 = new Cellule(4, 5);
        cellule3 = new Cellule(3, 5);
        cellule4 = new Cellule(3, 4);
        cellule5 = new Cellule(2, 4);
        serpent = new Serpent(cellule);
    }

    @Test
    public void constructorTest() {
        serpent.manger(cellule2, Action.DROITE);
        assertEquals(Action.DROITE, serpent.corps.get(0).action);
        assertEquals(Action.AUCUN, serpent.corps.get(1).action);
        serpent.manger(cellule3, Action.MONTER);
        assertEquals(Action.DROITE, serpent.corps.get(0).action);
        assertEquals(Action.MONTER, serpent.corps.get(1).action);
        assertEquals(Action.AUCUN, serpent.corps.get(2).action);
        serpent.manger(cellule4, Action.GAUCHE);
        assertEquals(Action.DROITE, serpent.corps.get(0).action);
        assertEquals(Action.MONTER, serpent.corps.get(1).action);
        assertEquals(Action.GAUCHE, serpent.corps.get(2).action);
        assertEquals(Action.AUCUN, serpent.corps.get(3).action);
        serpent.manger(cellule5, Action.MONTER);
        assertEquals(Action.DROITE, serpent.corps.get(0).action);
        assertEquals(Action.MONTER, serpent.corps.get(1).action);
        assertEquals(Action.GAUCHE, serpent.corps.get(2).action);
        assertEquals(Action.MONTER, serpent.corps.get(3).action);
        assertEquals(Action.AUCUN, serpent.corps.get(4).action);
        serpent.allerADroite();
        assertEquals(Action.MONTER, serpent.corps.get(0).action);
        assertEquals(Action.GAUCHE, serpent.corps.get(1).action);
        assertEquals(Action.MONTER, serpent.corps.get(2).action);
        assertEquals(Action.DROITE, serpent.corps.get(3).action);
        assertEquals(Action.AUCUN, serpent.corps.get(4).action);
        serpent.monter();
        serpent.allerAGauche();
        serpent.descendre();
        assertEquals(Action.DROITE, serpent.corps.get(0).action);
        assertEquals(Action.MONTER, serpent.corps.get(1).action);
        assertEquals(Action.GAUCHE, serpent.corps.get(2).action);
        assertEquals(Action.DESCENDRE, serpent.corps.get(3).action);
        assertEquals(Action.AUCUN, serpent.corps.get(4).action);
        assertEquals(5, serpent.taille());

    }

    @Test
    public void toStringTest() {
        assertEquals("Serpent {{ ligne ='4', colonne ='4'}AUCUN'taille '1}", serpent.toString());
    }
}
