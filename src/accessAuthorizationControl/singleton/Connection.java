package accessAuthorizationControl.singleton;

class Connection {

    short[] array = new short[5];

    private Connection(){
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
    }

    private static Connection connection = new Connection();

    public static Connection access() {
        return connection;
    }

}
