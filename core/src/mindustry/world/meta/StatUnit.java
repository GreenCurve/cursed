package mindustry.world.meta;

import arc.*;

import java.util.*;

/**
 * Defines a unit of measurement for block stats.
 */
public enum StatUnit{
    blocks,
    blocksSquared,
    powerSecond,
    liquidSecond,
    itemsSecond,
    liquidUnits,
    powerUnits,
    degrees,
    seconds,
    minutes,
    perSecond,
    perMinute,
    timesSpeed(false),
    percent(false),
    shieldHealth,
    none,
    items,
    kelvins;



    public final boolean space;

    StatUnit(boolean space){
        this.space = space;
    }

    StatUnit(){
        this(true);
    }

    public String localized(){
        if(this == none) return "";
        return Core.bundle.get("unit." + name().toLowerCase(Locale.ROOT));
    }
}
