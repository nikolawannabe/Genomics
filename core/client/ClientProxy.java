package Genomics.core.client;

import net.minecraftforge.client.MinecraftForgeClient;
import Genomics.core.CommonProxy;

public class ClientProxy extends Genomics.core.CommonProxy {
        
        @Override
        public void registerRenderers() {
                MinecraftForgeClient.preloadTexture(ITEMS_PNG);
                MinecraftForgeClient.preloadTexture(BLOCK_PNG);
        }
        
}