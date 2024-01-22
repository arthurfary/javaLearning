public class Cat implements Felino{
    private String name;
    public Cat(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String ronronar() {
        return "Purrrr";
    }

    @Override
    public String move() {
    return "Gato está se movendo";
    }

    @Override
    public String makeNoise() {

        return "Miau mano";
    }
}
