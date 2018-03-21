package initialization.explicitStaticInit;

import static util.Print.print;

class Plane{

    static int altitude = 9000; //meter
    static int speed; //k/h
    Plane(int speed) {
        this.speed = speed;
        print(altitude);
        print(this.speed);
    }

}
