package interfaces.exe9;

abstract class Instrument implements Playable{
    private int i; // storage allocated for each

    public String what() {
        return "Extentable";
    }
    public abstract void adjust();
}
