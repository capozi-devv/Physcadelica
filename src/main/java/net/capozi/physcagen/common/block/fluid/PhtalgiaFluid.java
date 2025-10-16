package net.capozi.physcagen.common.block.fluid;

import net.capozi.physcagen.Physcadelica;
import net.capozi.physcagen.foundation.BlockInit;
import net.capozi.physcagen.foundation.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;

public class PhtalgiaFluid extends PhtalgiaFluidContainer {
    @Override
    public Fluid getStill() {
        return Physcadelica.STILL_PHTALGIA;
    }
    @Override
    public Fluid getFlowing() {
        return Physcadelica.FLOWING_PHTALGIA;
    }

    @Override
    public Item getBucketItem() {
        return ItemInit.PHTALGIA_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState fluidState) {
        return BlockInit.PHTALGIA_FLUID.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(fluidState));
    }

    public static class Flowing extends PhtalgiaFluid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState fluidState) {
            return fluidState.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return false;
        }
    }
    public static class Still extends PhtalgiaFluid {
        @Override
        public int getLevel(FluidState fluidState) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return true;
        }
    }
}
