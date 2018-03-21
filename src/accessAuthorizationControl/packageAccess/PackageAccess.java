package accessAuthorizationControl.packageAccess;

import static util.Print.print;

public class PackageAccess {

    public static void main(String[] args) {
        TongTong tongtong = new TongTong();
        print(tongtong.getImpression());

        HalloKaty maomao = new HalloKaty();
        print(maomao.beautiful);
        print(maomao.gpa);
        print(maomao.name);
        print(maomao.getBeautiful());
        print(maomao.getGpa());
        print(maomao.getName());
    }
}
