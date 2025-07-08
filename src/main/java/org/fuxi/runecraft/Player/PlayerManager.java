package org.fuxi.runecraft.Player;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.fuxi.runecraft.Player.Classes.PlayerClass;
import org.fuxi.runecraft.Player.Species.Species;

public class PlayerManager {
    private int level;
    private int HP;
    private Player player;
    private Species species;
    private PlayerClass playerClass;
    private Stats stats;

    public PlayerManager(Player player) {
        this.player = player;
    }

    public void updatePlayerSpeed() {
        player.getAttribute(Attribute.MOVEMENT_SPEED).setBaseValue((species.getSpeed() / 9) * 0.1000000049011612);
    }

    public void updatePlayerSize() {
        player.getAttribute(Attribute.SCALE).setBaseValue(species.getSize() / 1.65);
    }

    //Calculates the Modifier for the Stat
    public int calcModifier(int value) {
        switch (value) {
            case 1:
                return -5;
            case 2:
            case 3:
                return -4;
            case 4:
            case 5:
                return -3;
            case 6:
            case 7:
                return -2;
            case 8:
            case 9:
                return -1;
            case 10:
            case 11:
                return 0;
            case 12:
            case 13:
                return 1;
            case 14:
            case 15:
                return 2;
            case 16:
            case 17:
                return 3;
            case 18:
            case 19:
                return 4;
            case 20:
            case 21:
                return 5;
            case 22:
            case 23:
                return 6;
            case 24:
            case 25:
                return 7;
            case 26:
            case 27:
                return 8;
            case 28:
            case 29:
                return 9;
            case 30:
                return 10;
        }
        return 0;
    }
}
