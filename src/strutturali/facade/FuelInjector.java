package strutturali.facade;

public class FuelInjector {
    
    private boolean started;
    
    private boolean injected;

    public void on() {
        System.out.println("Engine starting...");
        started = true;
        System.out.println("Engine started.");
    }


    public boolean isStarted() {
        return this.started;
    }

    public void inject() {
        System.out.println("Injecting...");
        injected = true;
    }

    public void off() {
        System.out.println("Engine stopping...");
        started = false;
        injected = false;
        System.out.println("Engine stopped.");
    }
}