import javax.crypto.spec.PSource;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arrayNumbers = {10, 63, 74, 8, 2};

        ///  TASK 1
        int result = calculateDifference(arrayNumbers);
        System.out.println("The difference between the largest and smallest values is " + result);

        /// TASK 2
        findNumbers(arrayNumbers);

        /// TASK 3
        double x = 2;
        double y = 4;

        double expressionResult = calculate(x, y);
        System.out.println("Expression result: "+ expressionResult);
    }

    public static int calculateDifference(int[] arrayNumbers){

        int maxValue = arrayNumbers[0];
        int minValue = arrayNumbers[0];

        for (int i = 1; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > maxValue) {
                maxValue = arrayNumbers[i];
            }
            else if (arrayNumbers[i] < minValue) {
                minValue = arrayNumbers[i];
            }
        }

        return maxValue - minValue;

    }

    public static void findNumbers(int[] arrayNumbers) {

        int smallest = arrayNumbers[0];
        int secondSmallest = arrayNumbers[0];

        for (int j = 1; j < arrayNumbers.length; j++) {
            if (arrayNumbers[j] < smallest) {
                secondSmallest = smallest;
                smallest = arrayNumbers[j];
            }
            else if (arrayNumbers[j] < secondSmallest) {
                secondSmallest = arrayNumbers[j];
            }
        }

        System.out.println("The smallest and second smallest numbers of the array are: " + smallest +" y "+ secondSmallest);

    }

    public static double calculate(double x, double y) {
        double outParenthesis = Math.pow(x, 2);
        double inParenthesis = Math.pow((4*y/5-x), 2);

        return outParenthesis + inParenthesis;

    }
}