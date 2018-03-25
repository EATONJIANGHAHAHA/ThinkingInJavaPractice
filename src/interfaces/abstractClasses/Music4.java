package interfaces.abstractClasses;

import static util.Print.print;

public class Music4 {

    static void tune(Instrument instrument) {
        instrument.play(Note.C);
    }

    static void tuneAll(Instrument[] instruments) {
        for(Instrument i: instruments) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        RandomInstrumentFactory randomInstrumentFactory = new RandomInstrumentFactory();

        Instrument[] instruments = new Instrument[10];
        for(int i = 0; i < 10; i++) {
            instruments[i] = randomInstrumentFactory.newInstrument();
        }
        //tuneAll(instruments);
        print(what(instruments));
        adjust(instruments);
        whattf(instruments);
    }

    public static String what(Instrument[] instruments) {
        String string = "";
        for(Instrument instrument: instruments) {
            string += instrument.what();
            string += " ";
        }
        return string;
    }

    public static void whattf(Object[] instruments) {
        for(Object instrument: instruments) {
            print(instrument);
        }
    }

    public static void adjust(Instrument[] instruments) {
        for(Instrument instrument: instruments) {
            instrument.adjust();
        }
    }
}
