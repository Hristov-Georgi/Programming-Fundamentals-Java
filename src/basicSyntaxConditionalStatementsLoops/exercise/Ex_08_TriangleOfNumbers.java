package basicSyntaxConditionalStatementsLoops.exercise;

import java.util.Scanner;

public class Ex_08_TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {

            for (int count = 1; count <= row; count++) {

                System.out.print(row + " ");
            }

            System.out.println();

        }
    }
}
