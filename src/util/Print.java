package util;

import java.io.PrintStream;

public class Print {

    /**
     * this method will print the given object with indented lines.
     * @param object
     */
    public static void print(Object object) {
        System.out.println(object);
    }

    public static void print() {
        System.out.println();
    }

    public static void printnb(Object object) {
        System.out.print(object);
    }

    public static PrintStream printtf(String format, Object...args) {
        return System.out.printf(format,args);
    }
}
