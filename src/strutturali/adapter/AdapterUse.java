package strutturali.adapter;

public class AdapterUse {
    
    public void useAdapter() {
        Vehicle ford = new Ford();
        VehicleAdapter fordAdapter = new VehicleAdapterImpl(ford);

        System.out.println(fordAdapter.getSpeed());
    }
 
}
