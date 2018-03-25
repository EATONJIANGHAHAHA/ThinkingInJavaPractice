package polymorphic.Extentable2;

public class Animal {

    public static void main(String[] args) {
        Robent[] robents = new Robent[6];
        RandomRobentFactory randomRobentFactory = new RandomRobentFactory();
        for(int i = 0; i < robents.length; i++) {
            robents[i] = randomRobentFactory.newRobent();
        }

        allEat(robents);
    }

    public static void allEat(Robent[] robents) {
        for(int i = 0; i < robents.length; i ++) {
            robents[i].eat();
        }
    }
}
