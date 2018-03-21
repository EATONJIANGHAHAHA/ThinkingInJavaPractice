package initialization.instanceInit;

import static util.Print.print;

class InstanceString {

    String string;

    InstanceString(String string) {
        this.string = string;
        print("String \"" + string + ".\" is been initialized.");
    }

}
