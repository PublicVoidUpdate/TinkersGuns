package com.ashe.tinkersguns;

import com.ashe.tinkersguns.item.ModItems;
import com.ashe.tinkersguns.miscellaneous.GunTab;
import com.ashe.tinkersguns.block.ModBlocks;
import com.ashe.tinkersguns.fluid.ModFluids;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.launchwrapper.LogWrapper;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.ashe.tinkersguns.proxy.CommonProxy;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;

import static net.minecraft.launchwrapper.LogWrapper.log;

@Mod(modid = TinkersGuns.MODID, name = TinkersGuns.MODNAME, version = TinkersGuns.MODVERSION)
public class TinkersGuns {

    public static final String MODID = "tinkersguns";
    public static final String MODNAME = "Tinker's Guns";
    public static final String MODVERSION= "0.0.1";
    
    @SidedProxy(serverSide = "com.ashe.tinkersguns.proxy.CommonProxy", clientSide = "com.ashe.tinkersguns.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static TinkersGuns instance;
    
    public static final GunTab creativeTab = new GunTab();

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {
    	public static void registerFluids(RegistryEvent.Register<Fluid> event) {
    		ModFluids.register(event.getRegistry();)
    	}
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event) {
            ModItems.registerModels();
            ModBlocks.registerModels();
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ModBlocks.register(event.getRegistry());
        }
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        if(Loader.isModLoaded("TConstruct")) {
            LogWrapper.info("YO TCONSTRUCT YOU READY TO SHOOT SOME FRICKIN SKELLIES?");
            LogManager.getLogger("TConstruct").info("Who the hell are you?");
            LogWrapper.info("'MERICA FTW WOOOOOOOOOO");
            LogManager.getLogger("TConstruct").info("...What the hell?");
        }

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }
}

