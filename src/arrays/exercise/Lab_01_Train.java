package arrays.exercise;

import java.util.Scanner;

public class Lab_01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] wagons = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int people = Integer.parseInt(scanner.nextLine());

            wagons[i] = people;
            System.out.print(wagons[i] + " ");
            sum += people;

        }
        System.out.println();
        System.out.print(sum);

    }
}
