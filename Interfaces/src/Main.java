public class Main {
    public static void main(String[] args) {

        Dog cachorro = new Dog("Pipoca");
        Cat gato = new Cat("Quindim");

        System.out.println(
                cachorro.getName()
                + " diz '"
                + cachorro.makeNoise()
                + "' e se move: "
                + cachorro.move()
        );

        System.out.println(
                gato.getName()
                + " diz '"
                + gato.makeNoise()
                + "', ronrona: '"
                + gato.ronronar()
                + "' e se move: "
                + gato.move()
        );

        // usando função default
        // using default function
        System.out.println(
                "Tanto o " + cachorro.getName() +
                " quanto o " + gato.getName() +
                " podem respirar com .breathe(): " + cachorro.breathe() // gato.breathe()
        );


    }
}