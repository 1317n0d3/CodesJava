package Practice.Tasks.Task3;

import java.util.ArrayList;
import java.util.List;

public class UnitBase {
    List<Unit> units = new ArrayList<>();

    public UnitBase(Unit...units) {
        for (Unit unit : units){
            this.units.add(unit);
        }
    }

    public void addUnitsToBase(List<Unit> units){
        for (Unit unit : units){
            this.units.add(unit);
        }
    }

    public void moveUnits(){
        for (Unit unit : units){
            unit.move();
        }
    }

    public void getUnitsHealth(){
        for (Unit unit : units){
            System.out.println("Unit "+ unit.getName() + " health: " + unit.getHp());
        }
    }

    public int shootUnits(){
        int shootSum = 0;
        for (Unit unit : units){
            shootSum += unit.shoot();
        }
        return shootSum;
    }

    public void damageUnits(int damage){
        for (Unit unit : units){
            unit.getDamage(damage);
        }
    }
}
