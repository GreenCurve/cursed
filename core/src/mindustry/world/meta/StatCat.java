package mindustry.world.meta;

import arc.*;

/** A specific category for a stat. */
public enum StatCat{
    general,
    power,
    liquids,
    items,
    crafting,
    function,
    optional,
    heat;
    public String localized(){
        return Core.bundle.get("category." + name());
    }
}
