package com.example;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class ViandeTest {
    @Mock
    Viande viande;

    @Before
    public void initiation() {
    }

    @Test
    public void nouvellePositionTest() {
        viande = new Viande(new Airedejeu(1, 1));
        assertEquals((new Cellule(1, 1)).toString(), viande.nouvellePosition().toString());
        Cellule cellule = new Cellule(1, 1);
        viande = mock(Viande.class);
        when(viande.nouvellePosition()).thenReturn(cellule);
        assertEquals(cellule, viande.nouvellePosition());
    }
}
