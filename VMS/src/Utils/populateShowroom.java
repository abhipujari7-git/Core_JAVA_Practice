package Utils;

import static Utils.validationRules.validateVehicle;

import java.util.HashMap;
import java.util.Map;

import com.app.core.Vehicle;

import CustomVehicleException.VehicleHandlingException;

public class populateShowroom  {
	
	public static Map<String, Vehicle> populateMap()throws VehicleHandlingException{
		Map<String, Vehicle> Showroom1 = new HashMap<>();
		 /*chasisNo,  date,  company, double basePrice,  color,  type,*/
			/* double netPrice,HashMap<String, Vehicle> showroom */
		System.out.println(Showroom1.put("aaa1", validateVehicle("aaa1", "2023-02-02", "Honda", 15000.0, "red", "DIESEL",  Showroom1)));
		System.out.println(Showroom1.put("aaa2", validateVehicle("aaa2", "2023-02-01", "Honda", 15000.0, "red", "PETROL",  Showroom1)));
		System.out.println(Showroom1.put("aaa3", validateVehicle("aaa3", "2023-01-02", "Honda", 15000.0, "red", "EV",  Showroom1)));
		System.out.println(Showroom1.put("aaa4", validateVehicle("aaa4", "2023-05-02", "Honda", 15000.0, "red", "HYBRID",  Showroom1)));
		System.out.println(Showroom1.put("aaa5", validateVehicle("aaa5", "2023-09-02", "Honda", 15000.0, "red", "DIESEL",  Showroom1)));
		
		
		
		return Showroom1;
	
		
		
		
	}
	
	
	
}
