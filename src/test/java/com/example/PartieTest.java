package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PartieTest {

    Partie partie;
    Action action;
    int colonne =4;
    int ligne = 4;

    @Before
    public void setup(){
        action = Action.AUCUN;
        partie  = new Partie(new Cellule(ligne, colonne),action);
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
    }
}
    