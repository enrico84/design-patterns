package strutturali.flyweight;

import strutturali.bridge.Color;

public class FlyweightCar implements FlyweightVehicle {
    private Engine engine;
    private Color color;

    public FlyweightCar(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;
    }


    @Override
    public void start() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }

    @Override
    public Color getColor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getColor'");
    }

}
