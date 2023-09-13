package strutturali.facade;

public class AirFlowController {
    private boolean started;

    public void takeAir() {
        System.out.println("AirFlow starting...");
        this.started = true;
        System.out.println("AirFlow started");
    }

    public void off() {
        System.out.println("AirFlow stopping...");
        started = false;
        System.out.println("AirFlow stopped");
    }
}
