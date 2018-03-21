package initialization.arrayObject;

import static util.Print.print;

public class ArrayString {

    String[] stringArray = {"Thie", "is", "a", "sentence"};

    void printArray() {
        for (String s : stringArray) {
            print(s);
        }
    }
}
