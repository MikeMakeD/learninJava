package day11.task1;

public class Picker implements Worker{
    private int salary;
    private final int SALARY_PICKER = 80;
    private boolean isPayed;
    private Warehouse warehouse;
    private final int LIMIT_PREMIUM = 10000;
    private final int SUM_PREMIUM = 70000;

    public int getSalary() {
        return salary;
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Зарплата сбощика: " + SALARY_PICKER + ", Выплачено: " + getSalary();
    }

    @Override
    public void doWork() {
        salary+=SALARY_PICKER;
        this.warehouse.countPickedOrders++;
        if (warehouse.countPickedOrders == LIMIT_PREMIUM) {
            bonus();
            this.warehouse.countPickedOrders++;
        }
    }

    @Override
    public void bonus() {
        if (warehouse.countPickedOrders == LIMIT_PREMIUM) {
            System.out.println("Сборщик получает премию!");
            salary += SUM_PREMIUM;
        }
        else if (warehouse.countPickedOrders < LIMIT_PREMIUM)
            System.out.println("Бонус пока недоступен!");
        else System.out.println("Бонус уже выплачен!");
    }

}
