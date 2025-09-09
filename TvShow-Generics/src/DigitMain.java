//Demonstrating how to use generics
import java.util.Scanner;
public class DigitMain {
    public static <T> void main(String[] args){
        //Line 7 - 31 Integer Array
        //Prompting the user for value to determine how long the integer array should be.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array you want to create:");
        int length = input.nextInt();
        //Creating an Integer Array
        Integer[] intArray =  new Integer[length];

        //Prompting and getting the user value and assigning it to an array
        // index until the length of the array is reach.
        for (int i = 0; i < length; i++){
            System.out.println("Enter the number you want to creat:");
            intArray[i] = input.nextInt();

        }

        System.out.println("What element do you want to search for?");
        int search = input.nextInt();

        //The for loop allows to go through the array to search for a number and
        // break the loop once found and print the index.
        for (Integer integer : intArray) {
            if (integer == search) {
                System.out.println("Index: " + Digit.indexOf(intArray, search));
                break;
            }
        }

        //Lines 34 - 56 Double Array
        System.out.println("Enter the size of array you want to create:");
        int lengthDouble = input.nextInt();
        //Create double array
        Double[] doubleArray = new Double[lengthDouble];

        //Prompting and getting the user value and assigning it to an array
        // index until the length of the array is reach.
        for (int i = 0; i < lengthDouble; i++){
            System.out.println("Enter the decimal number you want to create:");
            doubleArray[i] = input.nextDouble();
        }

        System.out.println("What element do you want to search for?");
        double searchDouble = input.nextDouble();

        //The for loop allows to go through the array to search for a double and
        // break the loop once found and print the index it was at.
        for (int i = 0; i < lengthDouble; i++) {
            if (doubleArray[i] == searchDouble) {
                System.out.println("Index: " + Digit.indexOf(doubleArray, searchDouble));
                break;
            }
        }

        //LInes 58-80: Prompts and get input from the user for a String
        System.out.println("Enter the size of array you want to create:");
        int lengthString = input.nextInt();
        input.nextLine();
        //Create a String array
        String[] petArray = new String[lengthString];
        //For Loop is prompting and getting the user String and assigning it to an array
        // index until the length of the array is reach.
        for (int i = 0; i < petArray.length; i++){
            System.out.println("Enter a pet's name you want to create:");
            petArray[i] = input.nextLine();
        }

        System.out.println("What element do you want to search for?");
        String searchString = input.nextLine();
        //The for loop allows to go through the array to search for a String and
        // break the loop once found and print the index it was found.
        for (int i =  0; i<lengthString; i++) {
            if(petArray[i].equals(searchString)) {
            System.out.println("Index: " + Digit.indexOf(petArray, searchString));
                break;
            }
        }
    }
}
