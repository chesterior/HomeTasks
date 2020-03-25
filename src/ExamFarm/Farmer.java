package ExamFarm;

import java.util.Date;
import java.util.Random;

public class Farmer {
    String name = "Фермер";
    Random random = new Random(new Date().getTime());
    int resource = 5;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public void takeResources (GiveResources animal) {

    }

    public void eatAnimal (CanBeEaten animal) {

    }

    public boolean banishAnimal (WildAnimal animal){
        boolean banish = random.nextBoolean();
        if (banish) {
            System.out.println("Прогнал животное" + animal.getName());
        }
        return banish;
    }

    public void feedAnimal (HomeAnimal animal) {     // кормить животных
        animal.health += 3;
    }

    public void useResource(){
        resource -= 1;
    }
}
