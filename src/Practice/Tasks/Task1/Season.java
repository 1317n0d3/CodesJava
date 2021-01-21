package Practice.Tasks.Task1;

import java.util.ArrayList;
import java.util.List;

public class Season {
    List<Animal> animals = new ArrayList<>();

    public Season(Animal...animals) {
        for (Animal x : animals){
            this.animals.add(x);
        }
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void summer(){
        for (Animal x : animals){
            x.summerBehavior();
        }
    }

    public void winter(){
        for (Animal x : animals){
            x.winterBehavior();
        }
    }
}
