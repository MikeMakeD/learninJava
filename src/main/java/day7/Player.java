package day7;

import java.util.Random;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA= 100;
    public static final int MIN_STAMINA= 0;
    private static int countPlayers;


    public int getStamina() {
        return stamina;
    }
    public Player(int stamina){
        this.stamina = stamina;
        if(countPlayers>=0&&countPlayers<6) {
            countPlayers++;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if(stamina==MIN_STAMINA){
            return;
        }
        stamina--;
        if (getStamina() == MIN_STAMINA) {
            System.out.println("Угроку нужен отдых, угрок уходит с поля!");
            countPlayers--;
        }


    }

    public static void info(){
        if(getCountPlayers()<6){
            System.out.println("Команды неполные. На поле еще есть "+(6-getCountPlayers())+" свободных мест");
        }
        else System.out.println("Мест в команде больше нет");
    }

}
