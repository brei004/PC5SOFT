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
    @Test
    public void testGameState() {
        when(mockPlayer.getScore()).thenReturn(100);
        when(mockPlayer.getBaseHealth()).thenReturn(50);
        game.gameState();
        verify(mockPlayer).getScore();
        verify(mockPlayer).getBaseHealth();
    }
    @Test
    public void testStartWave() {
        game.startWave(wave);
        verify(wave).start();
    }
    @Test
    public void testPlaceTower() {
        Tower mockTower = mock(Tower.class);
        game.placeTower(mockTower, 1, 1);
        verify(mockMap).placeTower(mockTower, 1, 1);
    }


}