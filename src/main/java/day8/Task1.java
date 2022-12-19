package day8;

public class Task1 {
    public static void main(String[] args) {
        String[] arrayString = new String[20000];
        String s1 = " ";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arrayString.length; i++) {
            s1 += i+ " ";
        }
        long stopTime = System.currentTimeMillis();
//        System.out.println(s1);
        StringBuilder sB = new StringBuilder();
        long startTimeSB = System.currentTimeMillis();
        for (int i = 0; i <arrayString.length; i++) {
            sB.append(arrayString[i]+" ");
        }
        long stopTimeSB = System.currentTimeMillis();
//        System.out.println(sB);
        System.out.println(stopTime - startTime);
        System.out.println(stopTimeSB - startTimeSB);
    }
}
