package TestShowroom;

import java.util.Scanner;

import com.app.car;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import Enums.*;
import static java.time.LocalDate.*;
import ValidationRules.validationRules;
import ValidationRules.validationRules.*;

public class testerShowroom {

	public static void main(String[] args) {
//		try (Scanner sc = new Scanner(System.in)) {
		Scanner sc = new Scanner(System.in);
			int ch = 0;
			int cnt = 0;
			car[] showroom = new car[5];

			System.out.println("1. Add new Vehicle to the showroom");
			System.out.println("2. Display all vehicles");
			System.out.println("3. Apply discount on a particular vehicle / by some company");
			System.out.println("4. Remove vehicle details");

			do {
				System.out.println("enter choice");
				ch = sc.nextInt();
				switch (ch) {
				case 1:

					if (cnt == 0) {
						System.out.println("Enter chasis no.");
						String cha = sc.next();
						System.out.println("Enter Price(double)");
						double price = sc.nextDouble();
						System.out.println("Enter Color");
						String c = sc.next();
						System.out.println("Enter Category");
						Category cat = Category.valueOf(sc.next().toUpperCase());
						showroom[cnt++] = new car(cha, price, c, cat);

					} else {
						try {
						if (cnt < showroom.length) {
							System.out.println("Enter chasis no.");
							String cha = sc.next();
							validationRules.findDups(cha, showroom);
							System.out.println("Enter Price(double)");
							double price = sc.nextDouble();
							System.out.println("Enter Color");
							String c = sc.next();
							validationRules.validateColor(c);
							System.out.println("Enter Category");
							Category cat = Category.valueOf(sc.next());
							showroom[cnt++] = showroom[cnt++] = new car(cha, price, c, cat);

						}
						}catch(Exception e) {
							System.out.println("err msg= "+e.getMessage());
						}
					}
				//	System.out.println(showroom[0]);
					break;
				case 2:
					System.out.println("-------Case 2--------");
					for (car s : showroom) {
						if (s != null)
							System.out.println(s);
					}
					break;
				case 3:
					break;
				case 4:
					break;
				}
			} while (ch > 0 && ch < 3);

//			System.out.println("Enter color");
//			
//			validationRules.validateColor(sc.next());
//			
//			System.out.println("Enter date");
//			LocalDate d = parse(sc.next());
//			validationRules.validateManDates(d);

//			String[] ch = {"12345a","12345s","12345f","123456q"};
			// System.out.println("Color " + c);
//			validationRules.findDups();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
	}

}
