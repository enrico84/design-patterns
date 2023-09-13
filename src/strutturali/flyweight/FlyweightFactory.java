package strutturali.flyweight;

import java.util.HashMap;
import java.util.Map;

import strutturali.bridge.Color;

public class FlyweightFactory {
    private static Map<Color, FlyweightVehicle> vehiclesCache
  = new HashMap<>();

public static FlyweightVehicle createVehicle(Color color) {
    FlyweightVehicle newVehicle = vehiclesCache.computeIfAbsent(color, newColor -> { 
        Engine newEngine = new Engine();
        return new FlyweightCar(newEngine, newColor);
    });
    return newVehicle;
}
}
