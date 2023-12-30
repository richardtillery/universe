package com.galaxy.record;

import com.star.record.Star;
import com.world.record.World;

import java.util.List;

public record Galaxy(String name, List<Star> starList, List<World> worldList) {

    public Galaxy {
        name = name.toUpperCase();
    }
}
