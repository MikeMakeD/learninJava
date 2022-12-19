package day11.task2;

public abstract class Hero {
    double health = 100;
    double physDef;
    double magicDef;
    double physAtt;

    public void physAttack(Hero hero) {
        double sumAttack=(this.physAtt * (1 - hero.physDef));
        if ((hero.health-sumAttack)< 0) {
            hero.health = 0;
        } else {
            hero.health -= sumAttack;
        }
    }
}
