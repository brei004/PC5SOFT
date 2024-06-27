package org.example;

import java.util.*;

public class TowerDefenseGame {
    Map map;
    Player player;
    List<Wave> waves;

    public TowerDefenseGame() {
        this.map = new Map();
        this.player = new Player();
        this.waves = new ArrayList<>();
    }
    public TowerDefenseGame(Map map, Player player, List<Wave> waves) {
        this.map = map;
        this.player = player;
        this.waves = (waves != null) ? waves : new ArrayList<>();
    }
    public void placeTower(Tower tower, int x, int y) {
        map.placeTower(tower, x, y);
    }

    public void startWave(Wave wave) {
        waves.add(wave);
        wave.start();
    }

    public void gameState() {
        System.out.println(map);
        System.out.println("Puntuación: " + player.getScore());
        System.out.println("Vida de la base: " + player.getBaseHealth());
    }

    public static void main(String[] args) {
        TowerDefenseGame game = new TowerDefenseGame();
        game.placeTower(new Tower('T'), 0, 1);
        game.startWave(new Wave());
        game.gameState();
    }
}
