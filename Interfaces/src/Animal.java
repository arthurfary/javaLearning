// interfaces are basically molds the BEHAVIOR for subclasses
// every subclass of "Animal" MUST override "Animal"'s methods

/*
 interfaces são basicamente moldes para o FUNCIONAMENTO subclasses
 toda subclasse de "Animal" DEVE sobreescrever os metodos de "Animal"
*/
public interface Animal {
    // interfaces do not have abstract variables
    String move();
    String makeNoise();

    // nested interfaces are used with "Animal.NestedInterfaceName"

    // default functions are functions that do not need to be overwritten
    // funções default são funções que não precisam ser sobreescritas; todas as sublcasses têm
    default String breathe(){
        exale(); // wrong order of breathing but oh well
        return "Animal is breathing";
    }


    // private method can only be called inside the interface by default and other private methods
    private void exale(){
        System.out.println("--> Private method in Animal is run");
    }


}
