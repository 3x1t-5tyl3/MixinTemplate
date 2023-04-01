package ch.exitian.largeorenodesremove.mixin;

import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin {

    @Inject (method = "oreVeinsEnabled(Lnet/minecraft/world/level/levelgen)", at = @At("HEAD"), cancellable = true)
    public void oreVeinsEnabled0(CallbackInfoReturnable<Boolean> callback) {
        callback.setReturnValue(false);
    }
}

