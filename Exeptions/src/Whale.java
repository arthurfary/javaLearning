public class Whale {
    public static void boop() throws ClassNotFoundException //any checked exeptions - https://www.tutorialspoint.com/java/java_builtin_exceptions.htm
    {
        System.out.println("*whale noises*");
        throw new ClassNotFoundException();
    }
}
