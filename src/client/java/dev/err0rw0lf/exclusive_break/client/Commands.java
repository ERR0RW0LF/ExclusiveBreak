package dev.err0rw0lf.exclusive_break.client;

import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.command.v2.ClientCommands;
import net.minecraft.network.chat.Component;

public class Commands {

    public static void Init() {
        // Register commands here
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, commandBuildContext) -> {
            dispatcher.register(ClientCommands.literal("clienttater").executes(context -> {
                context.getSource().sendFeedback(Component.literal("Called /clienttater with no arguments."));
                return 1;
            }));
        });
    }
}
