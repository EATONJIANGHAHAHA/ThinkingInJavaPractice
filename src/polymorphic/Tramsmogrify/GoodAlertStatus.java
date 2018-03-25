package polymorphic.Tramsmogrify;

import static util.Print.print;

public class GoodAlertStatus extends AlertStatus {

    @Override
    public void showStatus() {
        print("Good");
    }
}
