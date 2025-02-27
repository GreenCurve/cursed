package mindustry.type;

import arc.graphics.*;
import arc.struct.*;
import mindustry.ctype.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;

public class Item extends UnlockableContent{
    public Color color;

    /** how explosive this item is. */
    public float explosiveness = 0f;
    /** flammability above 0.3 makes this eleigible for item burners. */
    public float flammability = 0f;
    /** how radioactive this item is. 0=none, 1=chernobyl ground zero */
    public float radioactivity;
    /** drill hardness of the item */
    public int hardness = 0;
    /** all these constants are used to calculate block stats using requirements
     /** how good it is at conducting heat */
    public float heatConduction = 1f;
    /** how many heat you need to increase temperature by 1 Kelvin */
    public float heatCapacity = 1000f;
    /** when reached, heat will hurt */
    public float maxTemperature = 600f; //in Kelvins
    /**
     * base material cost of this item, used for calculating place times
     * 1 cost = 1 tick added to build time
     */
    public float cost = 1f;

    public Item(String name, Color color){
        super(name);
        this.color = color;
    }

    public Item(String name){
        this(name, new Color(Color.black));
    }

    @Override
    public void setStats(){
        stats.addPercent(Stat.explosiveness, explosiveness);
        stats.addPercent(Stat.flammability, flammability);
        stats.addPercent(Stat.radioactivity, radioactivity);
        stats.addPercent(Stat.heatConduction, heatConduction);
        stats.addPercent(Stat.heatCapacity, heatCapacity);
        stats.addPercent(Stat.maxTemperature, maxTemperature);
    }

    @Override
    public String toString(){
        return localizedName;
    }

    @Override
    public ContentType getContentType(){
        return ContentType.item;
    }

    /** Allocates a new array containing all items that generate ores. */
    public static Seq<Item> getAllOres(){
        return content.blocks().select(b -> b instanceof OreBlock).map(b -> ((Floor)b).itemDrop);
    }
}
