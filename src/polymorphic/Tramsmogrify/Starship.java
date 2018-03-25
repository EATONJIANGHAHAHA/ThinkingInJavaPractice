package polymorphic.Tramsmogrify;

public class Starship {

    AlertStatus alertStatus = new GoodAlertStatus();

    public void changeBadAlertStatus() {
        alertStatus = new BadAlertStatus();
    }

    public void changeFailAlertStatus() {
        alertStatus = new FailAlertStatus();
    }

    public static void main(String[] args) {
        Starship starship = new Starship();
        starship.alertStatus.showStatus();
        starship.changeBadAlertStatus();
        starship.alertStatus.showStatus();
    }
}
