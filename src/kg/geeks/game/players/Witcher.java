package kg.geeks.game.players;

public class Witcher extends Hero{
    private int revivalChances;
    public Witcher(int health, int damage, String name) {
        super(health, damage, SuperAbility.SACRIFICIAL_REVIVAL, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (revivalChances > 0) {
            heroes.equals(heroes.getClass());
            revivalChances--;
        }
    }
}
