package creazionali.factorymethod;

public class CarFactory extends MotorVehicleFactory {

	@Override
	protected MotorVehicle createMotorVehicle() {
		return new Car();
	}

}
