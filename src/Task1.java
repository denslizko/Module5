import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        int[] mas = new int[7];
        Random rand = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(100);
            System.out.println(mas[i] + " ");
        }

        int max = mas[0];
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];
            }
            if (min > mas[i]) {
                min = mas[i];
            }
        }
        System.out.println(" maximum = " + max);
        System.out.println(" minimum = " + min);
    }
}