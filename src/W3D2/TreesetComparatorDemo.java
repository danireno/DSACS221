package W3D2;


import java.util.TreeSet;
public class TreesetComparatorDemo {

	public static void main(String a[]){
       
        TreeSet<Vehicle> priceComp = new TreeSet<Vehicle>(new MyPriceComp());
        priceComp.add(new Vehicle("Mazida",3000,1998));
        priceComp.add(new Vehicle("Renault",6000,1982));
        priceComp.add(new Vehicle("Mercedise",2000,2000));
        priceComp.add(new Vehicle("volvo",2400,1955));
    
        for(Vehicle e:priceComp){
            System.out.println(e);
        }
	}
	/* out put 
	 * VehicleName:  Mercedise VehiclePrice:  2000 Vehiclemodel:     2000
       VehicleName:  volvo VehiclePrice:  2400 Vehiclemodel:     1955
       VehicleName:  Mazida VehiclePrice:  3000 Vehiclemodel:     1998
       VehicleName:  Renault VehiclePrice:  6000 Vehiclemodel:     1982

	 * 
	 */
}
