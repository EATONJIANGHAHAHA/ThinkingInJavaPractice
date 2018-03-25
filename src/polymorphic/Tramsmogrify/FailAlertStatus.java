package polymorphic.Tramsmogrify;

import static util.Print.print;

public class FailAlertStatus extends AlertStatus {

    @Override
    public void showStatus() {
        print("Fail");
    }
}
