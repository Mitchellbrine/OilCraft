package com.Bart.oilcraft.Fluids;

import com.Bart.oilcraft.oilcraft;

import net.minecraftforge.fluids.Fluid;

public class BlockOil extends BaseFluid {

	 public BlockOil(Fluid fluid) {
	        super(fluid);
	        this.setBlockName("Oil");
	        ModFluids.registerFluid(this);
	        this.setCreativeTab(oilcraft.OilTab);
	}

}