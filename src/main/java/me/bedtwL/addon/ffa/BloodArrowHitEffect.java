package me.bedtwL.addon.ffa;

import me.bedtwL.ffa.api.PlayerArrowHitEffect;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class BloodArrowHitEffect implements PlayerArrowHitEffect {
    @Override
    public void ArrowHitEffect(Location location, Player player) {
        for (int i = 0; i < 1; i++) {
            location.getWorld().playEffect(location, Effect.STEP_SOUND, Material.REDSTONE_BLOCK);
        }
    }

    @Override
    public String getName() {
        return "blood-arrow-hit";
    }

    @Override
    public String getItemNameKey() {
        return "blood-arrow-hit";
    }

    @Override
    public ItemStack getItemBase() {
        return new ItemStack(Material.REDSTONE_BLOCK);
    }
}
