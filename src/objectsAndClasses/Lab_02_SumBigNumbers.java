package objectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class Lab_02_SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(scanner.nextLine());
        BigInteger secondNum = new BigInteger(scanner.nextLine());

        BigInteger summary = firstNum.add(secondNum);

        System.out.println(summary);
    }
}
