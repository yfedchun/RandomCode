import java.lang.reflect.Array;
import java.util.Arrays;
//import array library

public class LinearSearch {

    public static void main(String[] args) {
        long[] numbers = {758921582, 555511310, 757997938, 455232258, 352830024, 722582902, 185749006, 372111829, 917008333, 864973086, 386739964};  //define dataset
        long numToSearch = 722582902; //define a pattern to search for
        int arrLngth = Array.getLength(numbers); //get length for the numbers[] array

        String memLoc = numbers.toString(); //convert memory location for the numbers[] array to string
        System.out.println("\n\nTotal element count for array \'numbers[]': " + arrLngth); //display lenth for the numbers[] array

        for(int counter = 0; counter < arrLngth; counter++) { //loop through array, display stuff..

            System.out.println("\u001B[37m" + "Iteration # " + counter);
            System.out.println("Current memory location: " + memLoc);  //непонятно нахрена это здесь, но пусть будет..
            if(numbers[counter] == numToSearch) {
                System.out.println("\t * Match found at element " + counter + " *");
                System.out.println("\u001B[34m" + "\t It is the number you seek -- " + numbers[counter] + "\n");

                }

            else{
                System.out.println("\u001B[31m" + "No match found, but current value is " + numbers[counter] + "\n");
            }

        }
    }

}
