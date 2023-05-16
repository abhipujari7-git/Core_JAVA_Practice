package Custom_Exception;
@SuppressWarnings("serial")
public class noDupsExc extends Exception {
public noDupsExc(String errMsg) {
	super (errMsg);
}
}
