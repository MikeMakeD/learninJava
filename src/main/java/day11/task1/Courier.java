package day11.task1;

public class Courier extends Warehouse{
    private int salary;
    private boolean isPayed;

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
        String salaryPayed;
        if (isPayed) {
            salaryPayed = "Да";
        } else salaryPayed = "Нет";
        return "Зарплата доставщика: " + salary + ", Выплачена: " + salaryPayed;
    }
}
