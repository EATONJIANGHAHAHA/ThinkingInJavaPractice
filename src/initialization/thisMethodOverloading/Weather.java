package initialization.thisMethodOverloading;

class Weather {

    Weather weather = new Weather();

    void clearMethod(){

        methodToBeCalled(weather);
        methodToBeCalled(this);
    }

    void methodToBeCalled(Weather weather){
        System.out.println(weather);
    }
}
