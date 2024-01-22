public class Dog implements Animal{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String move() {
        return "Cachorro está se movendo";
    }

    @Override
    public String makeNoise() {
        return "Au au";
    }
}
