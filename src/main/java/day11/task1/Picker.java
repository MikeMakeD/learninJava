package day11.task1;

public class Picker extends Warehouse implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public Picker(int salary, boolean isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        String salaryPayed;
        if (isPayed) {
            salaryPayed = "Да";
        } else salaryPayed = "Нет";
        return "Зарплата сбощика: " + salary + ", Выплачена: " + salaryPayed;
    }

    @Override
    public void doWork() {
        System.out.println("Сборщику выплачена зп: "+getSalary());
        this.warehouse.countPickedOrders++;
    }
}
