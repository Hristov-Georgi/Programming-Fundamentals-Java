package methodsExercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(!input.equals("END")){

            if(isPalindrome(input)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
            input = scanner.nextLine();
        }




    }
    public static boolean isPalindrome (String input){

        String reversedString = "";

        for (int i = input.length() - 1; i >= 0 ; i--) {

            reversedString += input.charAt(i);

        }

        return input.equals(reversedString);

    }
}
