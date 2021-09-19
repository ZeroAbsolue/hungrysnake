package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PartieTest {

    Partie partie;
    Action action;
    int colonne =4;
    int ligne = 4;

    @BeforeEach
    public void setup(){
        action = Action.AUCUN;
        partie  = new Partie(new Cellule(ligne, colonne),action);
    }
        
    @Test
    public void test() {
        partie.allerADroite();
        assertEquals(colonne+1, partie.morceau.colonne);
        partie.allerAGauche();
        assertEquals(colonne,partie.morceau.colonne );
        partie.monter();
        assertEquals(ligne-1,partie.morceau.ligne );
        partie.descendre();
        assertEquals(ligne, partie.morceau.ligne );
    }
}
    