package net.wisefam;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.wisefam.meta.ModBlocks;

import java.util.Random;

public class ModWorldGenerator implements IWorldGenerator {

    private WorldGenMinable titaniumOreGenerator; //Generates Titanium Ore (used in Overworld)

    public ModWorldGenerator() {
        this.titaniumOreGenerator = new WorldGenMinable(ModBlocks.TITANIUM_ORE.getDefaultState(), 7, new UndergroundBlockPredicate());
        GameRegistry.registerWorldGenerator(this, 0);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator iChunkGenerator, IChunkProvider iChunkProvider) {
        switch (world.provider.getDimensionType()) {
            case OVERWORLD:
                runGenerator(this.titaniumOreGenerator, world, random, chunkX, chunkZ, 2, 40, 50);
                break;
            case NETHER:
                break;
            case THE_END:
                break;
        }
    }

    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chancesToSpawn; i++) {
            int x = chunk_X * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunk_Z * 16 + rand.nextInt(16);
            generator.generate(world, rand, new BlockPos(x, y, z));
        }
    }

    private class UndergroundBlockPredicate implements Predicate<IBlockState> {
        @Override
        public boolean apply(IBlockState input) {
            return input != null && (
                    input.getBlock() == Blocks.STONE || // includes Granite, Polished Granite, Diorite, Polished Diorite, Andesite, and Polished Andesite
                            input.getBlock() == Blocks.COBBLESTONE ||
                            input.getBlock() == Blocks.DIRT ||
                            input.getBlock() == Blocks.GRAVEL ||
                            input.getBlock() == Blocks.LAVA ||
                            input.getBlock() == Blocks.WATER ||
                            input.getBlock() == Blocks.SAND ||
                            input.getBlock() == Blocks.SANDSTONE ||
                            input.getBlock() == Blocks.FLOWING_LAVA ||
                            input.getBlock() == Blocks.FLOWING_WATER
            );
        }
    }
}
