package day11.task2;

public class Magician extends Hero implements PhysAttack,MagicAttack{


    public Magician() {
        health = 100;
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

    @Override
    public void physAttack(Hero hero) {
        double sumAttack=(this.physAtt * (1 - hero.physDef));
        if ((hero.health-sumAttack)< 0) {
            hero.health = 0;
        } else {
            hero.health -= sumAttack;
        }
    }
}
