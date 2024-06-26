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
    @Test
    public void testPlaceTowerAndStartWave() {
        // Crear una nueva instancia de TowerDefenseGame con un nuevo Map, Player, y lista de Waves
        TowerDefenseGame game = new TowerDefenseGame(new Map(), new Player(), new ArrayList<>());

        // Crear una nueva torre y colocarla en el mapa
        Tower tower = new Tower('T');
        game.placeTower(tower, 0, 1);

        // Iniciar una nueva Wave
        Wave wave = new Wave();
        game.startWave(wave);

        // Verificar que la Wave se ha añadido a la lista de Waves
        assertEquals(1, game.waves.size());
        assertNotNull(game.waves.get(0));

        // Verificar el estado del juego después de iniciar la Wave
        // Aquí asumimos que iniciar una Wave afecta de alguna manera la salud de la base o el puntaje del jugador
        assertEquals(100, game.player.getBaseHealth());
        assertEquals(0, game.player.getScore());
    }
}
