package strutturali.facade;

public class CatalyticConverter {
    
    private boolean started;
    public void on() {
        System.out.println("Catalytic starting...");
        started = true;
        System.out.println("Catalytic started.");
    }


    public boolean isStarted() {
        return this.started;
    }

    public void off() {
        System.out.println("Catalytic stopping...");
        started = false;
        System.out.println("Catalytic stopped.");
    }
}
