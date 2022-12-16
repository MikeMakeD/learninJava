package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        businessProcess(courier);
        businessProcess(picker);
        System.out.println(warehouse);
        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println(warehouse1);


    }
    static void businessProcess(Worker worker){
        for (int i = 0; i <10000 ; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

}
