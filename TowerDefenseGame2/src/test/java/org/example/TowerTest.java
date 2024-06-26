package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TowerTest {

    @Test
    public void testTowerInitialization() {
        Tower tower = new Tower('T');
        assertNotNull(tower);
        assertEquals('T', tower.getSymbol());
    }

}
