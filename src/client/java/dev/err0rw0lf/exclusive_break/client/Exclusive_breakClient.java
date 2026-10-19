package dev.err0rw0lf.exclusive_break.client;

import net.fabricmc.api.ClientModInitializer;

public class Exclusive_breakClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Commands.Init();
    }
}
