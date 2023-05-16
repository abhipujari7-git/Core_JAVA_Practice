package Utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.swing.tree.VariableHeightLayoutCache;

import com.app.core.Vehicle;

import CustomVehicleException.VehicleHandlingException;
import Enums.Color;
import Enums.Type;

public class validationRules {

	public static Vehicle validateVehicle(String chasisNo, String date, String company, double basePrice, String color,
			String type, Map<String, Vehicle> showroom) throws VehicleHandlingException {
		System.out.println("In validateVehicle -------");
		checkDupelicates(chasisNo, showroom);
		Color validColor = parseAndValidateColor(color);
		Type validType = parseAndValidateType(type);
		LocalDate validDate = parseAndValidateDate(date);
		System.out.println("Vehicle successfully added");
		return new Vehicle(chasisNo, validDate, company, basePrice, validColor, validType, basePrice);

	}

	public static void checkDupelicates(String chasisno, Map<String, Vehicle> showroom) {
		boolean flag = true;

		System.out.println("In checkDupelicates -------");

	}

	public static Color parseAndValidateColor(String color) throws VehicleHandlingException {
		System.out.println("In parseAndValidateColor -------");

		Color col = Color.valueOf(color.toUpperCase());

		System.out.println("In  -------");

		return col;
	}

	public static Type parseAndValidateType(String type) throws VehicleHandlingException {
		System.out.println("In parseAndValidateType -------");
		Type type1 = Type.valueOf(type.toUpperCase());
		return type1;
	}

	public static LocalDate parseAndValidateDate(String date) throws VehicleHandlingException {
		System.out.println("In parseAndValidateDate -------");
		LocalDate date1 = LocalDate.parse(date);
		return date1;
	}

}
