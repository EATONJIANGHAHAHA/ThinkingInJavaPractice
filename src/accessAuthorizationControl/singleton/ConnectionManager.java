package accessAuthorizationControl.singleton;

public class ConnectionManager {

    private Connection connection;

    public ConnectionManager() {
        connection = Connection.access();
    }

    public Connection newConnection() {
        return connection;
    }
}
