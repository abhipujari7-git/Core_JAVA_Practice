package tester;

import static Utils.populateShowroom.populateMap;

import java.util.Map;
import java.util.Scanner;

//import static 
import com.app.core.Vehicle;

import Enums.Color;
import Enums.Type;

public class testVMS {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<String, Vehicle> Showroom = null;
			boolean exit = false;
//			Map<String, Vehicle> Showroom = populateMap();

			System.out.println("Options 1. Add a Vehicle\r\n 2. Display all\r\n "
					+ "3. Get specific vehicle details\r\n 4. Apply discount\r\n "
					+ "5. Delete vehicle details  by ch no\r\n 6. Delete vehicles by color\r\n "
					+ "7. Sort the vehicles as per ch no\r\n " + "8. Sort the vehicles as per price\r\n"
					+ " 9. Sort the vehicles as per date n price\r\n "
					+ "10. Sort the vehicles as per date\r\n 0. Exit");
			System.out.println("Choose an option");

			while (!exit) {
				System.out.println("Enter choice");

				try {

					switch (sc.nextInt()) {
					case 1:
						Showroom = populateMap();

						break;
					case 2:
//						Showroom.values()
//						.stream()
//						for(Vehicle v : Showroom.values()) {
//							System.out.println(v);
//							
//						}
						Showroom.forEach((k, v) -> System.out.println(v));

						break;
					case 3:
						System.out.println("Enter Chasis no ");
						String chasis = sc.next();
						Showroom.values().stream().filter(s -> s.getChasisNo().equals(chasis))
								.forEach(v -> System.out.println(v));

						break;
					case 4:
						System.out.println("Enter Account type to add discount ");
						// Type type1 = Type.valueOf(sc.next().toUpperCase());

						Type type2 = Type.valueOf(sc.next().toUpperCase());

						Showroom.values().stream().filter(e -> e.getType() == type2)
								.forEach(s -> s.setNetPrice(s.getNetPrice() * 0.90));
						

						break;
					case 5:
						System.out.println("Enter Chasis no ");
						String chasis1 = sc.next();
						boolean isRemoved = Showroom.entrySet()
								.removeIf(e -> e.getValue().getChasisNo().equals(chasis1));

						if (isRemoved) {
							System.out.println(isRemoved);
							Showroom.forEach((k, v) -> System.out.println(v));
						} else {
							System.out.println("Vehicle not available");
						}

//						Showroom.values().stream().filter(s -> s.getChasisNo().equals(chasis1))
//						.collect(Collectors.toList());
////								.forEach(v -> System.out.println(v));
					case 6:
//						System.out.println("Enter color");
//						Color colour = Color.valueOf(sc.next().toUpperCase());
//						boolean remove =  Showroom.values()
//								.removeIf(a -> a.g)
						break;
					case 0:
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			e.getMessage();
		}
	}

}
