package strutturali.adapter;

public class VehicleAdapterImpl implements VehicleAdapter {
    private Vehicle luxuryCars;

    public VehicleAdapterImpl(Vehicle luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }
    
    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
