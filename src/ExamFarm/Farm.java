package ExamFarm;

import java.util.Date;
import java.util.Random;

public class Farm {
    Farmer farmer;
    HomeAnimal[] homeAnimals = new HomeAnimal[10];
    WildAnimal[] wildAnimals = new WildAnimal[3];
    Random random = new Random(new Date().getTime());


    public void addHomeAnimal(HomeAnimal animal) {
        for (int i = 0 ; i < homeAnimals.length; i++){
            if (homeAnimals[i] == null) {
                homeAnimals[i] = animal;
                return;
            }
        }
    }

    public void addWildAnimal(WildAnimal animal) {
        for (int i = 0 ; i < wildAnimals.length; i++){
            if (wildAnimals[i] == null) {
                wildAnimals[i] = animal;
                return;
            }
        }
    }

    public void passDay() {
        farmer.useResource();
        if(farmer.resource <= 0) {
            System.out.println("Игра заканчивается");
            return;
        }

        //2 и 3
        WildAnimal randWildAnimal = wildAnimals[random.nextInt(3)];
        if (!farmer.banishAnimal(randWildAnimal)) {
            randWildAnimal.attack(homeAnimals[random.nextInt(10)]);
        } else {
            System.out.println("Фермер прогнал дикое животное");
        }

        //4
        for (HomeAnimal an: homeAnimals) {
            farmer.feedAnimal(an);
        }


        // 5
        // Если таких не осталось, съедает животное, пригодное в пищу (если такие остались).


    }
}
