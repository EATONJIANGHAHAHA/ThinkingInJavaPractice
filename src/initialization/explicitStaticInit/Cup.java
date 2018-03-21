package initialization.explicitStaticInit;

import static util.Print.print;

class Cup {

    Cup(int marker) {
        print("Cup(" + marker + ")");
    }

    void f(int marker) {
        print("f(" + marker + ")");
    }


}
