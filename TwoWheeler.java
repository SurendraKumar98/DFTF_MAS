package day4.assignment;

public class TwoWheeler implements Engine,Features {
	private int registrationNumber;
	private String ownerName;
	private boolean autoStart;
	private boolean digitalSpeedOMeter;
	private FuelType fuelType;
	private String chasisNumber;
	private float salePrice;
	private int yearOfManufacturing;
	private float taxPrice; // apply the taxPercentage - automatically calculation
	private float totalPrice; // salePrice + taxPrice - automatically calculation



	@Override
	public int getRegistrationNumber() {
	return this.registrationNumber;
	}



	@Override
	public String getOwnerName() {
	return this.ownerName;
	}



	@Override
	public boolean isAutoStart() {
	return this.autoStart;
	}



	@Override
	public boolean isDigitalSpeedOMeter() {
	return this.digitalSpeedOMeter;
	}



	@Override
	public String getChasisNumber() {
	return this.chasisNumber;
	}



	@Override
	public FuelType getEngineFuelType() {
	return this.fuelType;
	}



	public TwoWheeler(int registrationNumber, String ownerName, boolean autoStart, boolean digitalSpeedOMeter,
	FuelType fuelType, String chasisNumber, float salePrice, int yearOfManufacturing) {
	super();
	this.registrationNumber = registrationNumber;
	this.ownerName = ownerName;
	this.autoStart = autoStart;
	this.digitalSpeedOMeter = digitalSpeedOMeter;
	this.fuelType = fuelType;
	this.chasisNumber = chasisNumber;
	this.salePrice = salePrice;
	this.yearOfManufacturing = yearOfManufacturing;
	this.taxPrice = this.salePrice * taxPercentage / 100;
	this.totalPrice = this.salePrice + this.taxPrice;
	}



	public float getTaxPrice() {
	return taxPrice;
	}



	public float getTotalPrice() {
	return totalPrice;
	}



	void printDetails() {
	System.out.println(this.ownerName + " bought a twowheeler for the total price of $ " + this.getTotalPrice());
	}



	public int getYearOfManufacturing() {
	return yearOfManufacturing;
	}
}
