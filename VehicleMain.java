package day4.assignment;

import java.util.Scanner;



public class VehicleMain {
public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
	System.out.println("Enter the Two wheeler Registration Number:");
	int regNumber = sc.nextInt();
	System.out.println("Enter the Your Name:");
	String ownerName = sc.next();
	System.out.println("Enter the Auto Start Enabled(true/false):");
	boolean autoStart = sc.nextBoolean();
	System.out.println("Enter the Digital SpeedOMeter(true/false):");
	boolean digitalSpeedOMeter = sc.nextBoolean();
	System.out.println("Enter the Two wheeler's Fuel Type" + java.util.Arrays.asList(FuelType.values()));
	FuelType fuelType = FuelType.PETROL;
	switch (sc.next()) {
	case "DIESEL":
	fuelType = FuelType.DIESEL;
	break;
	case "PETROL":
	fuelType = FuelType.PETROL;
	break;
	default:
	}
	System.out.println("Enter the Two wheeler Chasis Number:");
	String chasisNumber=sc.next();
	System.out.println("Enter the Two wheeler Sale Price:");
	float salePrice=sc.nextFloat();
	System.out.println("Enter the Two wheeler Year of Manufactured:");
	int yearOfManufacturing=sc.nextInt();
	
	TwoWheeler twoWheeler = new TwoWheeler(regNumber, ownerName, autoStart, digitalSpeedOMeter, fuelType, chasisNumber, salePrice, yearOfManufacturing);
	twoWheeler.printDetails();
}

}
}
