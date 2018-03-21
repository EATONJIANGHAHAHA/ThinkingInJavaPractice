package initialization.termination;

class Tank {

    //0 == empty, 1 == full
    int status = 0;
    int id;

    Tank() {
        this(0,0);
    }

    Tank(int status, int id) {
        setStatus(status);
    }

    void setStatus(int status) {
        this.status = status;
    }

    int getStatus(int status) {
        return this.status;
    }

    @Override
    protected void finalize() throws Throwable {
        if (status == 0) {
            System.out.println("Tank is been collected.");
            super.finalize();
        }
        else
            System.out.println("Tank is full.");
    }
}
