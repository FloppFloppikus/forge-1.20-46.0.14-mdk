package net.floppfloppikus.moreredstone.item;

import net.floppfloppikus.moreredstone.MoreRedstone;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreRedstone.MOD_ID);

    // Content

    public static final RegistryObject<CreativeModeTab> MORE_REDSTONE_TAB =
            CREATIVE_MODE_TABS.register("moreredstone_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HEATER_ROD.get()))
                            .title(Component.translatable("creativetab.moreredstone_tab"))
                            .displayItems((pParameters, pOutput) -> {
                                // Content
                                pOutput.accept(ModItems.HEATER_ROD.get());
                                // -------
                            })
                            .build());

    // -------

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
