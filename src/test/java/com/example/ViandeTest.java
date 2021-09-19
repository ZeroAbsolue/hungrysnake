package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class ViandeTest {
    @Mock
    Viande viande;

    @BeforeEach
    public void initiation() {
    }

    @Test
    public void nouvellePositionTest() {
        Cellule cellule = new Cellule(1, 1);
        viande = mock(Viande.class);
        when(viande.nouvellePosition()).thenReturn(cellule);
        assertEquals(cellule, viande.nouvellePosition());
    }
}
