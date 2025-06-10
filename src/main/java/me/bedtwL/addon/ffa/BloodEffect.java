package me.bedtwL.addon.ffa;

import me.bedtwL.ffa.api.PlayerHitEffect;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class BloodEffect implements PlayerHitEffect {
    @Override
    public void hitEffect(Location location, Player player) {
        playBloodEffect(location);
    }
    @Override
    public String getName() {
        return "blood";
    }

    @Override
    public String getItemNameKey() {
        return "blood";
    }

    @Override
    public ItemStack getItemBase() {
        return new ItemStack(Material.REDSTONE);
    }
    public static void playBloodEffect(Location location) {
        for (int i = 0; i < 1; i++) {
            location.getWorld().playEffect(location, Effect.STEP_SOUND, Material.REDSTONE_BLOCK);
        }

    }
}
