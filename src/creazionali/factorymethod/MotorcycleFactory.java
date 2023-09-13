package creazionali.factorymethod;

public class MotorcycleFactory extends MotorVehicleFactory {

	@Override
	protected MotorVehicle createMotorVehicle() {
		return new Motorcycle();
	}

}
