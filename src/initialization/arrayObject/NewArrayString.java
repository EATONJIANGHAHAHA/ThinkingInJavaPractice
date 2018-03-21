package initialization.arrayObject;

import static util.Print.print;

class NewArrayString {

    String string;

    NewArrayString(String string) {
        this.string = string;
    }

    public static void main(String[] args) {
        for(String s: args) {
            print(s + " ");
        }
    }
}
