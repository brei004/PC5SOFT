package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TowerDefenseGameIntegrationTest {


    @Test
    public void testPlaceTowerAndGameState() {

        TowerDefenseGame game = new TowerDefenseGame(new Map(), new Player(), new ArrayList<>());
        Tower tower = new Tower('T');

        // Se coloca una torre en el mapa
        game.placeTower(tower, 0, 1);

        // Verificamos el estado del juego
        assertEquals(100, game.player.getBaseHealth());
        assertEquals(0, game.player.getScore());
    }

    @Test
    public void testStartWave() {

        TowerDefenseGame game = new TowerDefenseGame(new Map(), new Player(), new ArrayList<>());

        // Se inicia la Wave
        game.startWave(new Wave());

        // Verificamos la creación de la Wave
        assertEquals(1, game.waves.size());
        assertNotNull(game.waves.get(0));
    }
}
