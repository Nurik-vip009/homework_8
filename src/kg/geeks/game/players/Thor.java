package kg.geeks.game.players;

public class Thor extends Hero{
    private double stunChance;
    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.MJOLNIRS_STRIKE, name);
        this.stunChance = stunChance;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (Math.random() < stunChance) {
            boss.SkipRound();
        }
    }
}
