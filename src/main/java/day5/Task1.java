package day5;

public class Task1 {
    public static void main(String[] args) {
        Automobile bmv = new Automobile();
        bmv.setColor("");
        bmv.setModel("");
        bmv.setYearRelease(2);
        System.out.println(bmv.getColor());
        System.out.println(bmv.getYearRelease());
        System.out.println(bmv.getModel());
    }
}
class Automobile{
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

}


