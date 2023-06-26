package kg.geeks.game.players;

import java.util.Arrays;

public class Magic extends Hero {
    private int damagePoints;
    public Magic(int damagePoints,int health, int damage,  String name) {
        super(health, damage, SuperAbility.BOOST, name);
        this.damagePoints = damagePoints;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 ) {
                heroes[i].setHealth(heroes[i].getHealth() + this.damagePoints);
            }
        }
        System.out.println("Magic даёт жизнь " + Arrays.toString(heroes));
    }
}
