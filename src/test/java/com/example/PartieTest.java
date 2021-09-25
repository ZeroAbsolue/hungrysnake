package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PartieTest {

    Partie partie;
    Action action;
    int colonne =4;
    int ligne = 4;
    Cellule cellule;

    @Before
    public void setup(){
        action = Action.AUCUN;
        cellule = new Cellule(ligne, colonne);
        partie  = new Partie(cellule,action);
    }
        
    @Test
    public void test() {
        partie.allerADroite();
        assertEquals(colonne+1, (int)partie.morceau.colonne);
        partie.allerAGauche();
        assertEquals(colonne,(int)partie.morceau.colonne );
        partie.monter();
        assertEquals(ligne-1,(int)partie.morceau.ligne );
        partie.descendre();
        assertEquals(ligne, (int)partie.morceau.ligne );
        partie.setAction(Action.DESCENDRE);
        partie.bouger();
        partie.setMorceau(cellule);
        assertEquals(cellule, partie.getMorceau() );
    }

    @Test
    public void toStringTest() {
        assertEquals("{" +
        " partie='" + partie.getMorceau() + "'" +
        ", action='" + partie.getAction() + "'" +
        "}", partie.toString()); 
    }
}
    