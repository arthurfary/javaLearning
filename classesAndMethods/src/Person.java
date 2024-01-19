public class Person {
    private String name;
    private int age;

    private boolean isMale;

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    Person(String name, int age, boolean isMale){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    // method overloading: same function name different parameters
    String greet(){
        return (this.name + " says hello!");
    }

    String greet(String name){
        return (this.name + " says hello to " + name + ".");
    }




}
