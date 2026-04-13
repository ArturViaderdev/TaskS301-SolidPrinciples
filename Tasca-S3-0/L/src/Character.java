public class Character {
    private DamageStrategy damageStrategy;

    public Character(DamageStrategy damageStrategy)
    {
        this.damageStrategy = damageStrategy;
    }

    public void attack() {
        System.out.println("The character attacks with a weapon.");
    }
    public void takeDamage(int points) {
        damageStrategy.takeDamage(points);
    }
}
