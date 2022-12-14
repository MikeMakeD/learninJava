package day7;

public class Airplane {
    private String manufacture;
    private String name;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String name, int year, int length, int weight){
        this.name = name;
        this.year = year;
        this.length = length;
        this.weight= weight;

    }
    public String getName() {
        return name;
    }

    void info(){
        System.out.println("Изготовитель: "+name+ ", год выпуска: "+year+", длина: "+length +", вес:"+weight +", количество топлива в баке: "+ fuel);
    }
    void fillUp(int n){
        setFuel(getFuel()+n);
    }

    public int getFuel() {
        return fuel;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public static void compareAirplane(Airplane a1, Airplane a2){
        if(a1.length>a2.length){
            System.out.println(a1.getName()+" длинее");
        }
        else if(a2.length> a1.length){
            System.out.println(a2.getName()+ " длинее");
        }
        else System.out.println("Самолеты одинаковой длины");
    }
}
