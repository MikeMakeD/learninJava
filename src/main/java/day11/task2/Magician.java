package day11.task2;

public class Magician extends Hero implements PhysAttack,MagicAttack{
    double magicAtt;

    public Magician() {
        magicDef = 0.8;
        physDef = 0;
        physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public String toString() {
        return "Герой - маг, здоровья:" + health;
    }

    @Override
    public void magicAttack(Hero hero) {
        double sumAttack=(this.magicAtt * (1 - hero.magicDef));
        if (hero.health- sumAttack< 0) {
            hero.health = 0;
        } else {
            hero.health -= sumAttack;
        }
    }


}
