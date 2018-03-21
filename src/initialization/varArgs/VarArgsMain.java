package initialization.varArgs;

import static util.Print.print;

class VarArgsMain {

    public static void main(String...args) {
        for(String s: args) {
            print(s);
        }
    }

}
