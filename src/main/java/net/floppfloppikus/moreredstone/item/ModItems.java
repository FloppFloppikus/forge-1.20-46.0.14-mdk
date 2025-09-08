package net.floppfloppikus.moreredstone.item;

import net.floppfloppikus.moreredstone.MoreRedstone;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreRedstone.MOD_ID);

    public static void register(IEventBus EventBus){
        Items.register(EventBus);
    }
}
