package accessAuthorizationControl.singleton;

import static util.Print.print;

public class Singleton {



    public static void main(String[] args) {
        ConnectionManager cm = new ConnectionManager();
        print(cm.newConnection());
    }
}
