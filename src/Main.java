import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = arrayRandom(30);
        /**
         * Сумма
         */
        int sum = 0;
        for(int nomber : array){
            sum += nomber;
        }
        System.out.println("Сумма затрат за месяц составила " + sum + " рублей");;
        /**
         * макс и мин
         */
        Arrays.sort(array);
        System.out.println("Максимальная сумма трат за день составила " + array[array.length-1]);
        System.out.println("Минимальная сумма трат за день составила " + array[0]);
        /**
         * среднее
         */
        double midle = 0;
        for (int i = 0; i < array.length; i++){
            midle += array[i];
        }
        System.out.println("Средняя сумма трат за месяц равна " + midle/30);
        /**
         * 4 Задание
         */
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }



    }

    public static int[] arrayRandom(int lenght){
            Random random = new Random();
            int[] array = new int[lenght];
            for (int i = 0; i < lenght; i++){
                array[i] = random.nextInt(100_000) + 100_000;
            }
            return array;
        }


}
