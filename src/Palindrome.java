import java.util.Arrays; // way faster than importing java.util.*

// CODE NEEDS CLEANING UP, BUT IT WORKS
//  NEEDS REFACTORING !!!!!!!!!
//

public class Palindrome {

    public Palindrome() {  //constructor

    }// end constructor

    public static void main(String[] args) {  // main() method
        String wordOne = "tattarrattat";
        //String wordTwo = "WAW";  //not used for now
        //Palindrome xyz = new Palindrome();  //new class object
        System.out.println(wordOne);  //<-- why not printing out
        System.out.println("Straight text");


        int str_size;
        str_size = wordOne.length();
        System.out.println(str_size);
//convert string to array[]
        String[] ary = wordOne.split("");


        int index = str_size - 1;  //adjust length to actual array index
        System.out.println("Actuall array length is: " + index);

        //should I try while()? int i=0; i<
        for (int i = 0; i <= index; i++) {//start looping through the array
            if ( ary[i].equals(ary[index]) ) {    //compare first and last letter

                System.out.println("First and last letter MATCH");
                if (index == 0){ //
                    System.out.print("SUCCESS!  The word is a palindrome. Congrats."); //TODO fix logic
                }// end if loop
            }//end if loop
            else {
                System.out.println("Failed! The word is NOT a palindrome.  You suck!.");  //fuck yeah
                break;
           }

                if ( index > 0 ) {  //update index value
                    index = index - 1;}
                else{
                    System.out.print("SUCCESS!  The word is a palindrome. Congrats."); //TODO fix logic
                }

            }//end for loop
        }//end of main()
    } // end of class method



