package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WaveTest {

    @Test
    public void testWaveInitialization() {
        Wave wave = new Wave();
        assertFalse(wave.isStarted());
    }

    @Test
    public void testStartWave() {
        Wave wave = new Wave();
        wave.start();
        assertTrue(wave.isStarted());
    }
}
