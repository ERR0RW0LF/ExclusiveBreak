package dev.err0rw0lf.exclusive_break.client;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class ExclusiveBreakState {
    public boolean enabled = false;
    // List of Blocks that are able to be brocken example ["minecraft:stone", "minecraft:dirt"]
    public List<String> enabledBlocks = new ArrayList<>();
    public boolean AutoDisableOnToolSwitch = false;
    public boolean AutoDisableOnSlotSwitch = false;
}
