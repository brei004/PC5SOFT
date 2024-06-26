package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class TowerDefenseGameTest {
    @Mock
    private Map mockMap;
    @Mock
    private Player mockPlayer;
    @Mock
    private Wave wave;
    @InjectMocks
    private TowerDefenseGame game;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

/*
Además añadimos como dependecia a mockito
Esto nos ayudará a usar objetos simulados en nuestras pruebas
y poder simular comportamientos y dependencias, permite pobrar mediante aislamiento
de partes de la aplicación
testImplementation 'org.mockito:mockito-core:4.2.0'
 */
    @Test
    public void testGameState() {
        // Configurar mock para devolver un puntaje de 100 cuando se llama a getScore()
        when(mockPlayer.getScore()).thenReturn(100);
        // Configurar mock para devolver una salud de base de 50 cuando se llama a getBaseHealth()
        when(mockPlayer.getBaseHealth()).thenReturn(50);

        // Llamar al método gameState() del objeto game
        game.gameState();

        // Verificar que se llamó al método getScore() del objeto mockPlayer
        verify(mockPlayer).getScore();
        // Verificar que se llamó al método getBaseHealth() del objeto mockPlayer
        verify(mockPlayer).getBaseHealth();
    }

    // Prueba para iniciar una ola en el juego
    @Test
    public void testStartWave() {
        // Llamar al método startWave() del objeto game con el objeto wave como argumento
        game.startWave(wave);

        // Verificar que se llamó al método start() del objeto wave
        verify(wave).start();
    }

    // Prueba para colocar una torre en el mapa del juego
    @Test
    public void testPlaceTower() {
        // Crear un mock para la clase Tower
        Tower mockTower = mock(Tower.class);

        // Llamar al método placeTower() del objeto game con mockTower y coordenadas (1, 1)
        game.placeTower(mockTower, 1, 1);

        // Verificar que se llamó al método placeTower() del objeto mockMap con mockTower y coordenadas (1, 1)
        verify(mockMap).placeTower(mockTower, 1, 1);
    }


}