package day6;

class Automobile {
    private String model;
    private String color;
    private int yearRelease;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.isEmpty()){
            System.out.println("Ошибка,вы не ввели модель!");
        }
        else {
            this.model = model;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("Ошибка, вы не ввели цвет!");
        } else {
            this.color = color;
        }
    }


    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        if(yearRelease<=1768){
            System.out.println("Ошибка, автомобиль еще не изобретен!");
        } else {
            this.yearRelease = yearRelease;
        }
    }
    protected void info(){
        System.out.println("Это автомобиль");
    }
    protected int yearDifference(int inputYear){
        return Math.abs(yearRelease-inputYear);
    }

}


