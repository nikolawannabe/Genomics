package Genomics.core;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class GenericBlock extends Block {
	private int renderType;
	public GenericBlock (int id, int texture, int renderType, Material material) {
		super(id, texture, material);
		this.renderType = renderType;
		setLightValue(100F);
	}

	@Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool (World world, int x,
            int y, int z) {
        return null;
    }
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
	

    @Override
    public int getRenderType () {
        return renderType;
    }
    
    @Override
    public boolean isOpaqueCube () {
        return false;
    }

}
