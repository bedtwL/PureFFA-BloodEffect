package me.bedtwL.addon.ffa;

import me.bedtwL.ffa.api.EffectAddon;

public class BloodEffectMain implements EffectAddon {
    @Override
    public String getName() {
        return "BloodEffect";
    }

    @Override
    public String getAuthor() {
        return "bedtwL";
    }

    @Override
    public void onEnable() {
        new BloodEffect().registerHitEffect();
        new BloodExplodeEffect().registerKillEffect();
        new BloodArrowHitEffect().registerArrowHitEffect();
    }

    @Override
    public void onDisable() {
        new BloodEffect().unregisterHitEffect();
        new BloodExplodeEffect().unregisterKillEffect();
        new BloodArrowHitEffect().unregisterArrowHitEffect();
    }
}
