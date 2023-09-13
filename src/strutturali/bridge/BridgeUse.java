package strutturali.bridge;

public class BridgeUse {
    
    public Shape bridgeUse() {
          Shape square = new Square(new Blue());
          return square;
    }
}
