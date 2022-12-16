package day11.task1;

public class Courier implements Worker{
    private int salary;
    private static final int SALARY_COURIER = 100;
    private boolean isPayed;
    private Warehouse warehouseC;

    public Courier(Warehouse warehouseC) {
        this.warehouseC = warehouseC;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public Courier(int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    @Override
    public String toString() {
        return "Зарплата курьера: " + SALARY_COURIER + ", Выплачена: " + getSalary();
    }

    @Override
    public void doWork() {
        salary+=SALARY_COURIER;
        this.warehouseC.countDeliveredOrders++;
        if (warehouseC.countDeliveredOrders == 10000) {
            bonus();
            this.warehouseC.countDeliveredOrders++;
        }
    }

    @Override
    public void bonus() {
        if (warehouseC.countDeliveredOrders == 10000) {
            System.out.println("Курьер получает премию!");
            salary += 70000;
        }
        else if (warehouseC.countDeliveredOrders < 10000)
            System.out.println("Бонус пока недоступен!");
        else System.out.println("Бонус уже выплачен!");
    }
}
