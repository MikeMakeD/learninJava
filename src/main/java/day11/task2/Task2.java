package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman  = new Shaman();

        warrior.physAttack(paladin);
        System.out.println(paladin);
        paladin.physAttack(magician);
        System.out.println(magician);
        shaman.healTeammate(magician);
        System.out.println(magician);
        magician.magicAttack(paladin);
        System.out.println(paladin);
        shaman.physAttack(warrior);
        System.out.println(warrior);
        paladin.healHimself();
        System.out.println(paladin);
        for (int i = 0; i <5 ; i++) {
            warrior.physAttack(magician);
            System.out.println(magician);
        }
    }
}
