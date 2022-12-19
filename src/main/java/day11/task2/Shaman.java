package day11.task2;

public class Shaman extends Hero implements PhysAttack,MagicAttack,Healer{
    double healTeam;
    double healHim;
    double magicAtt;

    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        magicAtt = 15;
        healHim = 50;
        healTeam = 30;
    }

    @Override
    public String toString() {
        return "Герой - шаман, здоровья:" + health;
    }

    @Override
    public void healHimself() {
        if (this.health+this.healHim > 100) {
            this.health = 100;
        } else {
            this.health += healHim;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health+this.healTeam > 100) {
            hero.health = 100;
        } else {
            hero.health += this.healTeam;
        }
    }

    @Override
    public void magicAttack(Hero hero) {
        double sumAttack=(this.physAtt * (1 - hero.physDef));
        if ((hero.health-sumAttack)< 0) {
            hero.health = 0;
        } else {
            hero.health -= sumAttack;
        }
    }
}
