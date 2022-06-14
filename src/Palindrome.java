
public class Palindrome {
    String wordOne;
    String wordTwo;

    private Palindrome() {  //constructor
        wordOne = "WOW";
        wordTwo = "WAW";
    }// end constructor

    public static void main(String[] args) {  // main() method
        Palindrome test = new Palindrome();
        String Yes = "The word is a palindrome";
        String No = "The string is not a palindrome";

        //just compare the two using .equals() method
        if ( test.wordOne.equals(test.wordTwo) )
        {
            System.out.println(Yes);
        }// end of if()

        else {
            System.out.println(No);
        }// end of else
        // end of comparing using string class method

        /*  Break strings into arrays
            Get array size for both
            Set up two for loops, one from FRONT of first array, second from END of second one
            Compare each letter at each index

         */



        //else {System.out.println("Exception :: something went wrong");
       //char[] break_up1 = new char();
       //convert string to array



    } // end main() method
}
