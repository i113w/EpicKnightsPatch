package com.i113w.epicknightspatch;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod("epic_knights_patch")
public class EpicKnightsPatch {
    private static final Logger LOGGER = LoggerFactory.getLogger(EpicKnightsPatch.class);

    public EpicKnightsPatch(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("========================================");
        LOGGER.info("Epic Knights Patch v0.0.1 is loading");
        LOGGER.info("Fixing magistuarmory.mixins.json issue");
        LOGGER.info("========================================");
        LOGGER.info("This patch provides a fixed version of");
        LOGGER.info("magistuarmory.mixins.json to prevent");
        LOGGER.info("crashes in PCL2 and other launchers.");
        LOGGER.info("========================================");
        LOGGER.info("Issue: Empty mixin config causes crash");
        LOGGER.info("Solution: Override with valid config");
        LOGGER.info("========================================");
    }
}