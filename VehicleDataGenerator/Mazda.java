package Brands;

import Types.OriginType;
import Vehicles.Vehicle;

import java.util.ArrayList;


public class Mazda extends Brand {


    public Mazda(){
        super(Types.BrandNames.MAZDA.name());
    }

    public OriginType getBrandOrigin() {
        return Types.OriginType.JAPAN;
    }

    public void createVehicleList(){

        Vehicles.VehicleDataGenerator obj = new Vehicles.VehicleDataGenerator();
        vehicleList.addAll(obj.getMazdaCars());
    }

}
