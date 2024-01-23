public class Main {
    public static int positiveDivide(int firstNum, int dividedBy) {
        if (firstNum < 0 || dividedBy < 0) {
            throw new IllegalArgumentException("Both arguments must be positive");
        }
        try {
            return firstNum / dividedBy;
        } catch (ArithmeticException e){
            return 0; // return -1 if /0
        }
    }
    public static void main(String[] args) {

        int num = 10;
        int num2 = 3;

        System.out.println(positiveDivide(num, num2));

        try {
            Whale.boop();
        }catch (ClassNotFoundException e){
            System.out.println("Class not found exeption: " + e);
        }finally {
            System.out.println("Finally runs no matter what");
        }


    }


}