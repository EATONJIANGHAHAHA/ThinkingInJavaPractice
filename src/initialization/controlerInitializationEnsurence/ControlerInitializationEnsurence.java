package initialization.controlerInitializationEnsurence;

class ControlerInitializationEnsurence {

    public static void main(String[] args){

       new TestString();
       new TestStringInit();
    }

    static class TestString{

        String string;

        TestString(){

            System.out.println(string);
        }
    }

    static class TestStringInit{

        String string = "Initialized";

        TestStringInit(){

            System.out.println(string);
        }
    }
}
