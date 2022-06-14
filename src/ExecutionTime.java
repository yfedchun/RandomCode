public class ExecutionTime {

    static int loops;  // why 'static'?

    static {
        loops = 100;
    }

    //constructor{
    public int ExecutionTime() {
        int localLoops = loops;
        return loops;
    }// constructor

    public static void main(String args[]) {

        int i =0;
        for(i=0; i<loops; i++){
            switch(i){

            }
        }

        /*
        int i = 0;
        while(i < 100){
            String msg = "My name is Yasha + " + i;
            System.out.println(msg);
            i++;
        }
        */

        /*
        for(int i = 0; i < 100; i++){
            String msg = "My name is Yasha + " + i;
            System.out.println(msg);
        }
*/
    }

} // end of class