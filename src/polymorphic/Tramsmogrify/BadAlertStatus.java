package polymorphic.Tramsmogrify;

import static util.Print.print;

public class BadAlertStatus extends AlertStatus{

    @Override
    public void showStatus() {
        print("Bad");
    }
}
