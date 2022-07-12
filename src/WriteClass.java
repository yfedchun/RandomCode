import java.util.concurrent.ExecutionException;

import static java.lang.System.out;

public class WriteClass {
    //  PURPOSE:  create a generated class for a basic purpose, such as GlassOfWater
    //  initial_state == isItFull || isItEmpty || else
    //  take input parameters for a class to create; vars, functions
    //  write, save, compile and run the class by code


    //define class vars
        // input class vars
        //


    // define constructor
    // do the magic
    //


    // define methods


    //  LAST ONE TO DO
    // writeMain()


    // main() method
    public static void main(String args[]) {


        //  test class interdependency :: it WORKS
        //ExecutionTime boop = new ExecutionTime();   // double instance. refer directly to the class value/identifier

        out.println("Processing time: (m/s) " + ExecutionTime.loops);  // ???  WHY IS IT NOT PRINTING?   *  It is printing now, lines 3-7 in ExecutionTime.java



      // process arguments
        String input;
        input = args[0];


        // temp code
        String initiate = "Creating main() method without input " + input + "(String args[])";
        out.println(initiate + "  {\n\n}");

    }  // end main() method

    /*
     TODO:  writeout to a file
     save (?)
     create command line to compile
     create command line to run and show output code
     TODO:  writeout to a file
    */
}