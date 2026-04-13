public class Warrior extends Character {
    public Warrior() {
        super(new DamageStrategyAllowed());
    }

    @Override
    public void attack() {
        System.out.println("The warrior strikes with a sword.");
    }

    @Override
    public void takeDamage(int points) {

    }
}
