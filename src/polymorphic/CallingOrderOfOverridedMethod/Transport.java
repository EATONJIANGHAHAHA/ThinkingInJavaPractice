package polymorphic.CallingOrderOfOverridedMethod;

public class Transport {

    public static void main(String[] args) {
        Vehical vehical = new Bus();
        vehical.decelerate();
    }
}
