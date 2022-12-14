package day11.task2;

public class Paladin extends Hero implements PhysAttack,Healer{
    double healHim;
    double healTeam;

    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
        healHim = 25;
        healTeam = 10;
    }

    @Override
    public String toString() {
        return "Герой - паладин, Здоровье: "+health;
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

}
