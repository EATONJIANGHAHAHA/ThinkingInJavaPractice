package accessAuthorizationControl.packageAccess;

public class HalloKaty {

    public String name;
    private short age;
    protected float gpa;
    boolean beautiful;

    public HalloKaty() {
        name = "tongtong";
        age = 23;
        gpa = 4.0f;
        beautiful = true;
    }

    public String getName(){
        return name;
    }

    private short getAge() {
        return age;
    }

    protected float getGpa() {
        return gpa;
    }

    boolean getBeautiful() {
        return beautiful;
    }
}
