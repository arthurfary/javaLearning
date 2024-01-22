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

}
