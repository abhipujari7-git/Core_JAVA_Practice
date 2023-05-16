package CustomVehicleException;

@SuppressWarnings("serial")
public class VehicleHandlingException extends Exception {
	 private VehicleHandlingException(String msg) {
		super(msg);
	}
}
