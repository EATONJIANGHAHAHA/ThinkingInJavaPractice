package initialization.arrayObject;

import static util.Print.print;

class ArrayObject {

    public static void main(String[] args) {
        ArrayString arrayString = new ArrayString();
        arrayString.printArray();

        NewArrayString.main(new String[] {"What should it be"});
    }
}
