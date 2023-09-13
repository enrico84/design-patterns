package strutturali.flyweight;

import strutturali.bridge.Color;

public interface FlyweightVehicle {
    public void start();

    public void stop();

    public Color getColor();
}
