package Practice.Tasks.Task3;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.List;

public class UnitFactory {
    public int rankUnit = 0;

    public Unit getUnit(){
        if (rankUnit == 0)
            return new Soldier(100, 2, 10);
        else if (rankUnit == 1)
            return new Tank(500, 5, 100);
        else
            return new Plane(300, 20, 50);
    }

    public Unit upgradeUnit(){
        rankUnit++;
        return getUnit();
    }
}
