package Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbersList.size() - 1; i++) {
            double firstNum = numbersList.get(i);
            double secondNum = numbersList.get(i + 1);

            if(firstNum == secondNum){
                numbersList.set(i, firstNum + secondNum);
                numbersList.remove(i + 1);
                i = -1;

            }

        }

        System.out.println(joinElementsByDelimiter(numbersList, " "));


    }

    public static String joinElementsByDelimiter (List<Double> list, String delimiter){

        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";
        for (double item: list) {
            String numDf = df.format(item) + delimiter;
            result += numDf;

        }
        return  result;
    }
}
