package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class demo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int givenNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length ; j++) {

                if (array[i] + array[j] == givenNumber){

                    System.out.printf("%d %d%n", array[i], array[j]);
                }

            }

        }


    }
}
