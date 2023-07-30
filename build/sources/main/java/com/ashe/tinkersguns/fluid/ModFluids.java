package com.ashe.tinkersguns.fluid;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class ModFluids extends Fluid
{
   protected static int mapColor = 0x4b4e51;
// still:  "tconstruct:blocks/fluids/molten_metal"
// flowing: "tconstruct:blocks/fluids/molten_metal_flow"

   public ModFluids(String fluidName, ResourceLocation still, ResourceLocation flowing) 
   {
       super(fluidName, still, flowing);
   }

   public ModFluids(String fluidName, ResourceLocation still, ResourceLocation flowing, int mapColor) 
   {
       this(fluidName, still, flowing);
       setColor(mapColor);
   }

   public ModFluids(String fluidName, ResourceLocation still, ResourceLocation flowing, int mapColor, float overlayAlpha) 
   {
       this(fluidName, still, flowing, mapColor);
   }

   @Override
   public int getColor()
   {
       return mapColor;
   }

   public ModFluids setColor(int parColor)
   {
       mapColor = parColor;
       return this;
   }
   

   public static final ModFluids moltenGunmetal = (ModFluids) new ModFluids(
     "moltenGunmetal",
     new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), 
     new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow")
     );
   FluidRegistry.registerFluid(moltenGunmetal);
   

NBTTagList tagList = new NBTTagList();
//if you have access to the fluid-instance you can also do FluidStack.writeToNBT
NBTTagCompound fluid = new NBTTagCompound();
fluid.setString("FluidName", "moltenGunmetal");
fluid.setInteger("Amount", 720); // 144 = 1 ingot
tagList.appendTag(fluid);
//first alloy fluid
fluid = new NBTTagCompound();
fluid.setString("FluidName", "copper");
fluid.setInteger("Amount", 432); // 3/4 ingot
tagList.appendTag(fluid);
//second alloy fluid
fluid = new NBTTagCompound();
fluid.setString("FluidName", "tin");
fluid.setInteger("Amount", 144); // 1/4 ingot
tagList.appendTag(fluid);
//first alloy fluid
fluid = new NBTTagCompound();
fluid.setString("FluidName", "zinc");
fluid.setInteger("Amount", 144); // 3/4 ingot
tagList.appendTag(fluid);

NBTTagCompound message = new NBTTagCompound();
message.setTag("alloy", tagList);
FMLInterModComms.sendMessage("tconstruct", "alloy", message);
   

}