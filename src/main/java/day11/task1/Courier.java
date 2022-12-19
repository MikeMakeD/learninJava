package day11.task1;

public class Courier implements Worker{
    private int salary;
    private static final int SALARY_COURIER = 100;
    private boolean isPayed;
    private Warehouse warehouseC;
    private final int LIMIT_PREMIUM = 10000;
    private final int SUM_PREMIUM = 50000;

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
        if (warehouseC.countDeliveredOrders == LIMIT_PREMIUM) {
            bonus();
            this.warehouseC.countDeliveredOrders++;
        }
    }

    @Override
    public void bonus() {
        if (warehouseC.countDeliveredOrders == LIMIT_PREMIUM) {
            System.out.println("Курьер получает премию!");
            salary += SUM_PREMIUM;
        }
        else if (warehouseC.countDeliveredOrders < LIMIT_PREMIUM)
            System.out.println("Бонус пока недоступен!");
        else System.out.println("Бонус уже выплачен!");
    }
}
