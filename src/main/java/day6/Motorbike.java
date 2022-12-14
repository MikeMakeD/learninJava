package day6;


class Motorbike {
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    private String model;
    private String color;
    private int yearRelease;

//    public Motorbike(String model, String color, int yearRelease){
//        this.model = model;
//        this.color = color;
//        this.yearRelease = yearRelease;
//    }

    protected void info(){
        System.out.println("Это мотоцикл");
    }
    protected int yearDifference(int inputYear){
        int age = yearRelease-inputYear;
        if(age<=0){
            age = age*-1;
        }
        return age;
    }
}

