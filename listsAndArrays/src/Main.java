import java.util.Arrays;

public class Main {
    public static int[] makeNumberArray(int len){
        if (len < 0) {
            throw new RuntimeException("Len must be >= 0");
        }

        int[] numberArray = new int[len];
        
        for (int i = 0; i < len; i++){
            numberArray[i] = i;
        }

        return numberArray;
    }

    private static int sumFromArray(int[] arr, int len){
        if (len <= 0)
            return 1;
        return (sumFromArray(arr, len - 1) + arr[len-1]);

    }

    public static void main(String[] args) {
        int[] arr = makeNumberArray(10);
        System.out.println("The sum from in a array of len " + arr.length + " is " + sumFromArray(arr, arr.length));


    }
}