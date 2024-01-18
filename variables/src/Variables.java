
public class Variables {

    public static String dotAdder(int number){
        // convert number to string
        StringBuilder numStr = new StringBuilder().append(Integer.toString(number));;

        numStr.reverse();

        // my solution
        int dotCounter = 0;
        int orgStrLen = numStr.length();
        for (int i = 0; i <= orgStrLen; i++){
            if (i % 3 == 0 && i != orgStrLen && i != 0 ){
                numStr.insert(i + dotCounter, '.');
                dotCounter += 1;
            }
        }

        /*  bing ai solution

        for (int i = 3; i < numStr.length(); i += 4){
            numStr.insert(i, '.');
        }
        
        */

        return numStr.reverse().toString();
    }

    public static void main(String[] args) {
        // variables
        int numberOfFireflies = 10_000_000;
        //System.out.println(numberOfFireflies);
        System.out.println(dotAdder(numberOfFireflies));

    }

}