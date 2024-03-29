package strutturali.facade;

public class CarEngineFacade {
    
    private FuelInjector fuelInjector = new FuelInjector();
    private AirFlowController airFlowController = new AirFlowController();
    private Starter starter = new Starter();
    private CoolingController coolingController = new CoolingController();
    private CatalyticConverter catalyticConverter = new CatalyticConverter();

    public void startEngine() {
        fuelInjector.on();
        airFlowController.takeAir();
        fuelInjector.on();
        fuelInjector.inject();
        starter.start();
        coolingController.setTemperatureUpperLimit(CoolingController.DEFAULT_COOLING_TEMP);
        coolingController.run();
        catalyticConverter.on();
    }

     public void stopEngine() {
        fuelInjector.off();
        catalyticConverter.off();
        coolingController.cool(CoolingController.MAX_ALLOWED_TEMP);
        coolingController.stop();
        airFlowController.off();
    }
}
