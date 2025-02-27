package mindustry.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class Items implements ContentList{
    public static Item scrap, copper, lead, graphite, coal, titanium, thorium, silicon, plastanium, phaseFabric, surgeAlloy,
    sporePod, sand, blastCompound, pyratite, metaglass;

    @Override
    public void load(){
        copper = new Item("copper", Color.valueOf("d99d73")){{
            hardness = 1;
            cost = 0.5f;
            alwaysUnlocked = true;

            maxTemperature = 1350;
            heatConduction = 400;
            heatCapacity = 385;
        }};

        lead = new Item("lead", Color.valueOf("8c7fa9")){{
            hardness = 1;
            cost = 0.7f;
            alwaysUnlocked = true;

            maxTemperature = 600;
            heatConduction = 35;
            heatCapacity = 130;
        }};

        metaglass = new Item("metaglass", Color.valueOf("ebeef5")){{
            cost = 1.5f;

            maxTemperature = 1500;
            heatConduction = 1;
            heatCapacity = 700;
        }};

        graphite = new Item("graphite", Color.valueOf("b2c6d2")){{
            cost = 1f;

            maxTemperature = 4000;
            heatConduction = 300;
            heatCapacity = 700;
        }};

        sand = new Item("sand", Color.valueOf("f7cba4")){{
            alwaysUnlocked = true;

            maxTemperature = 2000;
            heatConduction = 20;
            heatCapacity = 540;
        }};

        coal = new Item("coal", Color.valueOf("272727")){{
            explosiveness = 0.2f;
            flammability = 1f;
            hardness = 2;
        }};

        titanium = new Item("titanium", Color.valueOf("8da1e3")){{
            hardness = 3;
            cost = 1f;

            maxTemperature = 2000;
            heatConduction = 20;
            heatCapacity = 540;
        }};

        thorium = new Item("thorium", Color.valueOf("f9a3c7")){{
            explosiveness = 0.2f;
            hardness = 4;
            radioactivity = 1f;
            cost = 1.1f;

            maxTemperature = 2000;
            heatConduction = 50;
            heatCapacity = 140;
        }};

        scrap = new Item("scrap", Color.valueOf("777777")){{

        }};

        silicon = new Item("silicon", Color.valueOf("53565c")){{
            cost = 0.8f;

            maxTemperature = 1700;
            heatConduction = 150;
            heatCapacity = 800;
        }};

        plastanium = new Item("plastanium", Color.valueOf("cbd97f")){{
            flammability = 0.1f;
            explosiveness = 0.2f;
            cost = 1.3f;

            maxTemperature = 2000;
            heatConduction = 20;
            heatCapacity = 540;
        }};

        phaseFabric = new Item("phase-fabric", Color.valueOf("f4ba6e")){{
            cost = 1.3f;
            radioactivity = 0.6f;

            maxTemperature = 2000;
            heatConduction = 50;
            heatCapacity = 140;
        }};

        surgeAlloy = new Item("surge-alloy", Color.valueOf("f3e979")){{
            maxTemperature = 10000;
            heatConduction = 1000;
            heatCapacity = 1000;
        }};

        sporePod = new Item("spore-pod", Color.valueOf("7457ce")){{
            flammability = 1.15f;
        }};

        blastCompound = new Item("blast-compound", Color.valueOf("ff795e")){{
            flammability = 0.4f;
            explosiveness = 1.2f;
        }};

        pyratite = new Item("pyratite", Color.valueOf("ffaa5f")){{
            flammability = 1.4f;
            explosiveness = 0.4f;
        }};
    }
}
