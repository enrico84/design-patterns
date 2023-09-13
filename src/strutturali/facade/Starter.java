package strutturali.facade;

public class Starter {

    private boolean started;

    public void start() {
        System.out.println("Starting...");
        started = true;
        System.out.println("Started.");
    }

    public void stop() {
        System.out.println("Stopping...");
        started = false;
        System.out.println("Stopped.");
    }
}
