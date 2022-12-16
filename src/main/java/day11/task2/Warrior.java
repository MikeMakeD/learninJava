package day11.task2;

public class Warrior extends Hero implements PhysAttack{


    public Warrior() {
        health = 100;
        physDef = 0.8;
        physAtt = 30;
        magicDef = 0;
    }

    @Override
    public String toString() {
        return "Герой - воин, здоровья:" + health;
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
