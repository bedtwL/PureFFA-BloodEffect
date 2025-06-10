package me.bedtwL.addon.ffa;

import me.bedtwL.ffa.api.PlayerKillEffect;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class BloodExplodeEffect implements PlayerKillEffect {
    @Override
    public void killEffect(Location location, Player player) {
        playBloodExplodeEffect(location);
    }
    @Override
    public ItemStack getItemBase() {
        return new ItemStack(Material.REDSTONE);
    }
    @Override
    public String getName() {
        return "blood";
    }

    @Override
    public String getItemNameKey() {
        return "blood-explode";
    }
    public static void playBloodExplodeEffect(Location location) {
        for (int i = 0; i < 3; i++) {
            location.getWorld().playEffect(location, Effect.STEP_SOUND, Material.REDSTONE_BLOCK);
        }
        location.getWorld().playEffect(location, Effect.EXPLOSION_HUGE, null);
    }
}
