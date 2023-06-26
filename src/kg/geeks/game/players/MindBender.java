package kg.geeks.game.players;
/*Mind Bender может проникать в разум босса и внушать ему иллюзии или негативные эмоции.
В результате босс становится более уязвимым к атакам героев или подвержен различным дебаффам.
Mind Bender может выбрать один из следующих эффектов для наложения на босса:
"Illusory Weakness" (Иллюзорная слабость) - Увеличивает получаемый боссом урон на определенный процент.
"Confusion" (Путаница) - Снижает точность и увеличивает шанс промаха босса.
"Nightmare" (Кошмар) - Наносит боссу психологический урон, что снижает его атаку в течение нескольких раундов.
Кроме того, Mind Bender обладает способностью "Mental Shield" (Ментальный щит):
Он может создать ментальный щит, который поглощает часть урона от атак босса, защищая себя и других героев в команде.
Mind Bender сочетает в себе силу разума и тонкую тактику для слома вражеской защиты и ослабления босса. Его способность контролировать мысли позволяет ему создавать стратегическое преимущество и помогать команде в нанесении эффективных ударов и дебаффов на босса.
*/
public class MindBender extends Hero{
    private int mindControlCharges;
    public MindBender(int health, int damage, String name) {
        super(health, damage, SuperAbility.NIGHTMARE, name);
        this.mindControlCharges = mindControlCharges;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (mindControlCharges > 0) {
            boss.getClass();
            mindControlCharges--;
        }
    }
}
