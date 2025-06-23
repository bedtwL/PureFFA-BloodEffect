package me.bedtwL.addon.ffa;

import me.bedtwL.ffa.api.EffectAddon;

import java.util.UUID;

public class BloodEffectMain implements EffectAddon {
    @Override
    public Integer getAPIVer() {return 1;}
    @Override
    public String getName() {
        return "BloodEffect";
    }

    @Override
    public String getAuthor() {
        return "bedtwL";
    }
    @Override
    public UUID authorUUID() {
        return UUID.fromString("f6edfcd8-f6b8-4e57-9367-8648953eaae2");
    }

    @Override
    public void onEnable() {
        new BloodEffect().registerHitEffect(this);
        new BloodExplodeEffect().registerKillEffect(this);
        new BloodArrowHitEffect().registerArrowHitEffect(this);
    }

    @Override
    public void onDisable() {
        new BloodEffect().unregisterHitEffect();
        new BloodExplodeEffect().unregisterKillEffect();
        new BloodArrowHitEffect().unregisterArrowHitEffect();
    }
}
