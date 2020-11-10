package mindustry.world.blocks.power;

import arc.*;
import arc.graphics.*;
import arc.math.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.world.*;
import mindustry.world.meta.*;

public class ThermalGenerator extends PowerGenerator{
    public Effect generateEffect = Fx.none;

    public ThermalGenerator(String name){
        super(name);
    }

    @Override
    public void setStats(){
        super.setStats();

    }

    @Override
    public void drawPlace(int x, int y, int rotation, boolean valid){

    }

    @Override
    public boolean canPlaceOn(Tile tile) {
        return true;
    }

    public class ThermalGeneratorBuild extends GeneratorBuild{
        public float sum;

        @Override
        public void updateTile(){
            productionEfficiency = sum + attribute.env();

            if(productionEfficiency > 0.1f && Mathf.chance(0.05 * delta())){
                generateEffect.at(x + Mathf.range(3f), y + Mathf.range(3f));
            }
            float delta =  heat().getFloorTemperature() - heat().getTemperature();
            if (delta > 0) {
                productionEfficiency = delta;
            } else {
                productionEfficiency = 0;
            }
        }

        @Override
        public void drawLight(){
            Drawf.light(team, x, y, (40f + Mathf.absin(10f, 5f)) * productionEfficiency * size, Color.scarlet, 0.4f);
        }

        @Override
        public void onProximityAdded(){
            super.onProximityAdded();


        }
    }
}
