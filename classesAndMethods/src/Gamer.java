public class Gamer extends Person{
    String[] games = new String[10];

    public String[] getGames() {
        return games;
    }

    public void setGames(String[] games) {
        this.games = games;
    }

    Gamer(String name, int age, boolean isMale, String[] games) {
        super(name, age, isMale);
        this.games = games;
    }
}
