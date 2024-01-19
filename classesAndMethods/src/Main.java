import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // new person object
        Person pessoa = new Person("Arthur", 20, true);

        // using overloading
        System.out.println(pessoa.greet());
        System.out.println(pessoa.greet("Mixirica"));

        Gamer gamer1 = new Gamer("Yellow", 22, true, new String[]{"Rainbow Six Siege", "Minecraft", "Roblox"});

        System.out.println(gamer1.greet("Mixirica"));

//        for (int i = 0; i < gamer1.getGames().length; i++){
//            System.out.println(gamer1.getGames()[i]);
//        }

        // for each -- for var in list
        for (String game : gamer1.getGames()){
            System.out.println(game);
        }

    }
}