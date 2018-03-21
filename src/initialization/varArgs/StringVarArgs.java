package initialization.varArgs;

import static util.Print.print;

class StringVarArgs {

    static void printStringVarArgs(String...args) {
        for(String s: args) {
            print(s);
        }
    }
}
