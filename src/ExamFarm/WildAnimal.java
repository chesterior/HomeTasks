package ExamFarm;

public class WildAnimal extends Animal {
    protected int strength;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void attack(HomeAnimal animal) {
        if (speed > animal.speed) {
            System.out.println(this.getName() + "Напало на" + animal.getName());
            animal.health -=5;
            if(animal.health <= 0) {
                System.out.println("Животное не на ферме");
            }

        }
    }
}
