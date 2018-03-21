package initialization.termination;

class Book {

    private boolean checkedOut = false;

    Book(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    void checkOut() {
        checkedOut = true;
    }

    protected void finalize() throws Throwable {
        if (checkedOut) {
            System.out.println("Error: checked out.");
            super.finalize();
        } else {
            System.out.println("status:" + checkedOut);
        }
    }
}
