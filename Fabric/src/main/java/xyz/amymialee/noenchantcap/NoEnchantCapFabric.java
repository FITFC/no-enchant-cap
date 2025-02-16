package xyz.amymialee.noenchantcap;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.gamerule.v1.CustomGameRuleCategory;
import net.minecraft.network.chat.Component;

public class NoEnchantCapFabric implements ModInitializer {
    public static final CustomGameRuleCategory ENCHANT_CAP_GAMERULES = new CustomGameRuleCategory(NoEnchantCap.id("no_enchant_cap"), Component.translatable("gamerule.category."+ NoEnchantCap.MOD_ID));

    @Override
    public void onInitialize() {
        NoEnchantCap.init();
        CommandRegistrationCallback.EVENT.register((commandDispatcher, commandBuildContext, commandSelection) -> EnchantedBookCommand.register(commandDispatcher));
    }
}