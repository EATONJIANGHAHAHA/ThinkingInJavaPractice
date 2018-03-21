package initialization.termination;

class Termination {

    public static void main(String[] args){
        Book book = new Book(true);
        book.checkIn();
        book.checkOut();
        book = new Book(true);
        System.gc();

        Tank tank = new Tank();
        tank.setStatus(0);
        //tank.setStatus((short)0);
        tank = new Tank();
        System.gc();
    }
}
