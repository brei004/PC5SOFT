package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TowerTestContratos {

    @Test
    void testConstructorValidSymbol() {
        char validSymbol = 'A';
        Tower tower = new Tower(validSymbol);
        assertEquals(validSymbol, tower.getSymbol(), "El símbolo devuelto debe ser igual al símbolo proporcionado");
    }

    @Test
    void testConstructorInvalidSymbol() {
        char invalidSymbol = ' ';

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Tower(invalidSymbol);
        });
        assertEquals("El simbolo tiene que ser imprimible", exception.getMessage(), "Debería lanzarse una excepción para símbolos no imprimibles");
    }
    @Test
    void testGetSymbol() {
        char symbol = 'B';
        Tower tower = new Tower(symbol);
        char retrievedSymbol = tower.getSymbol();

        assertEquals(symbol, retrievedSymbol, "El símbolo devuelto debe ser igual al símbolo establecido");
    }

}

