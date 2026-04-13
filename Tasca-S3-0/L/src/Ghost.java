public class Ghost extends Character {
    public Ghost() {
        super(new DamageStrategyNotAllowed());
    }

    @Override
    public void attack() {
        System.out.println("The ghost casts a spooky spell.");
    }
}
