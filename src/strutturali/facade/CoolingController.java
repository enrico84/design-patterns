package strutturali.facade;

public class CoolingController {
    public static final double DEFAULT_COOLING_TEMP = 90;
    public static final double MAX_ALLOWED_TEMP = 50;

    private double temperature;
    private boolean started;

    public void setTemperatureUpperLimit(double temperature) {
        this.temperature = temperature;
    }

    public void cool(double temperature) {
        this.temperature = temperature;
    }

    public void run() {
        System.out.println("Cooling starting...");
        started = true;
        System.out.println("Cooling started.");
    }

    public void stop() {
        System.out.println("Cooling stopping...");
        started = false;
        System.out.println("Cooling stopped");
    }


    public double getTemperature() {
        return temperature;
    }
}
