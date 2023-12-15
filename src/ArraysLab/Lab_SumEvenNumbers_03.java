package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        int[] numsArr = new int[inputArr.length];

        for (int i = 0; i < numsArr.length; i++) {
            numsArr[i] = Integer.parseInt(inputArr[i]);
        }

//        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//        .toArray();
        int evenSum = 0;

        for (int i = 0; i < numsArr.length; i++) {
            int currentElement = numsArr[i];
            if (currentElement % 2 == 0) {
                evenSum += currentElement;

            }

        }
        System.out.println(evenSum);

    }
}
