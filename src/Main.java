import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repeat;

        do{
            System.out.println("Please enter the size of arrray: ");
            int arraySize = scanner.nextInt();

            if (arraySize > 0){
                int[] arrayOfNumbers = new int[arraySize];


                for(int i=0; i < arraySize; i++){
                    int userInput;

                    while (true){
                        System.out.println("Input a #"+ (i+1) + " number: ");
                        userInput = scanner.nextInt();

                        if (userInput >= 0){
                            arrayOfNumbers [i] = userInput;
                            break;
                        } else {
                            System.out.println("Invalid input! Please enter a positive number greater than 0.");
                        }
                    }

                }

                int maxNumber = arrayOfNumbers[0];
                for (int i=0; i < arrayOfNumbers.length;i++){
                    if (arrayOfNumbers[i] > maxNumber){
                        maxNumber = arrayOfNumbers[i];
                    }
                }
                System.out.println("The max value of the array is: " + maxNumber);

                int minNumber = arrayOfNumbers[0];
                for(int i=0;i < arrayOfNumbers.length;i++){
                    if(arrayOfNumbers[i] < minNumber){
                        minNumber = arrayOfNumbers[i];
                    }
                }
                System.out.println("The min value of the array is: " + minNumber);

                int totalSum = 0;
                for (int i=0;i<arrayOfNumbers.length;i++){
                    totalSum += arrayOfNumbers[i];
                }
                System.out.println("The total sum of the array is: " + totalSum);

                double average = (double) totalSum /arrayOfNumbers.length;
                System.out.println("The average of the array is: " + average);

                System.out.println(Arrays.toString(arrayOfNumbers));
            } else {
                System.out.println("Cannot input below '0' or '0' value in the number of arrays");
            }

            System.out.println("Do you want to try again? (Y/N): ");
            repeat = scanner.next().charAt(0);
        } while (repeat == 'Y' || repeat == 'y');

        System.out.println("Thank you for using!");

    }
}