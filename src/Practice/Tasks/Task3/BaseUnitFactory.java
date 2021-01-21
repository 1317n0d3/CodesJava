package Practice.Tasks.Task3;

import Practice.Patterns.Behavioral.TemplateMethod.A;

import java.util.ArrayList;
import java.util.List;

public class BaseUnitFactory {
    List<UnitFactory> unitFactories = new ArrayList<>();

    public BaseUnitFactory(UnitFactory...unitFactories) {
        for (UnitFactory unitFactory : unitFactories){
            this.unitFactories.add(unitFactory);
        }
    }

    public void addUnitFactory(UnitFactory unitFactory){
        this.unitFactories.add(unitFactory);
    }

    public List<Unit> getUnitFromFactories(){
        List<Unit> units = new ArrayList<>();
        for (UnitFactory unitFactory : unitFactories){
            units.add(unitFactory.getUnit());
        }
        return units;
    }
}
