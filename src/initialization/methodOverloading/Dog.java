package initialization.methodOverloading;

class Dog {

    Dog(){}

    void bark(int barking, String string) { System.out.println( "barking"); }

    void bark(String string, int howling) { System.out.println( "howling"); }


}
