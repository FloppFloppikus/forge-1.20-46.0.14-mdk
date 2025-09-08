package net.floppfloppikus.moreredstone.item;

import net.floppfloppikus.moreredstone.MoreRedstone;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreRedstone.MOD_ID);

    public static final RegistryObject<Item> HEATER_ROD =
            ITEMS.register("heaterrod",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus EventBus){
        ITEMS.register(EventBus);
    }
}
