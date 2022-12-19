package day6;

class Airplane {
    private String manufacture;
    private String name;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public String getName() {
        return name;
    }

    public Airplane(String name, int year, int length, int weight){
        this.name = name;
        this.year = year;
        this.length = length;
        this.weight= weight;

    }

    void info(){
        System.out.println("Изготовитель: "+name+ ", год выпуска: "+year+", длина: "+length +", вес:"+weight +", количество топлива в баке: "+ fuel);
    }
    void fillUp(int n){
        fuel+=n;
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
}
