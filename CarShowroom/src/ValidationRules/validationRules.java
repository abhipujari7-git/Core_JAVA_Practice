package ValidationRules;

import java.time.LocalDate;

import com.app.car;

import Custom_Exception.checkColorExc;
import Custom_Exception.manDatesExc;
import Custom_Exception.noDupsExc;
import Enums.Color;

public class validationRules {

	public static void findDups(String ChasisNo, car[] c) throws noDupsExc {
		// String Cha = "123456q";
		boolean flag = false;
		int i = 0;
		System.out.println(c[0].getChasisno());
//		for(car cars :c ) {
//			System.out.println(cars);
//		}
		// String[] ch = { "12345a", "12345s", "12345", "123456q" };
		for (i = 0; i < c.length; i++) {
			if (ChasisNo.equals(c[i].getChasisno())) {
				System.out.println(c[i].getChasisno());
				// throw new noDupsExc("Chasis no. already available");
				flag = true;

			}

		}
		System.out.println("Flag= " + flag);
		if (flag) {

			throw new noDupsExc("Chasis no. already available");
		} else {

			throw new noDupsExc("Successfully added chasis no.");
		}
	}

	public static void validateColor(String col) throws checkColorExc {
		boolean flag = false;
		Color c = Color.valueOf(col.toUpperCase());

		Color[] myCol = Color.values();
		System.out.println("----inside validateColor------");

		for (Color c1 : myCol) {

			if (c1.equals(c)) {
				flag = true;
				// throw new checkColorExc("Thanks for Color choice");
			}
//			else {
//				throw new checkColorExc("Selected color is not in catalog");
//			}

		}
		if (flag)
			throw new checkColorExc("Thanks for Color choice");
		else
			throw new checkColorExc("Selected color is not in catalog");
	}

	public static void validateManDates(LocalDate d) throws manDatesExc {
		LocalDate fixDate = LocalDate.of(2023, 1, 1);
		System.out.println("----Inside validateManDates---");
		System.out.println(d);
		System.out.println("Fix date= " + fixDate);

		if (d.isBefore(fixDate)) {
			throw new manDatesExc("Old manufacturing Date Can't Accept");
		} else
			throw new manDatesExc("Successfully Added date of car");

	}
}
