package initialization.methodOverloading;

class MethodOverloading {

    public static void main(String[] args) {

        new Bird();
        new Bird("I amm a sparrow.");

        Dog dog = new Dog();
        dog.bark("1",1);
        dog.bark(1,"1");

        NoContructor noContructor = new NoContructor();
    }

}
