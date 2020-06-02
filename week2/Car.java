package pers.gc.copr;

public class Car {

	//fields
	private String make;
	private String model;
	private String year;
	private String transmission;
	private String color;
	private String engine;
	private String vinNumber;
	private double price;
	
	//Constructors
	public Car() { }
	
	public Car(String make, String model, String year, String vinNumber) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.vinNumber = vinNumber;
	}
	
	public Car(String make, String model, String year, String transmission, String color, String engine,
			String vinNumber, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.transmission = transmission;
		this.color = color;
		this.engine = engine;
		this.vinNumber = vinNumber;
		this.price = price;
	}

	//Getters and setters
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getVinNumber() {
		return vinNumber;
	}

	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	//Override toString method
	@Override
	public String toString() {
		return "Make: " + getMake() + "\n" +
				"Model: " + getModel() + "\n" +
				"Year: " + getYear() + "\n" +
				"Transmission: " + getTransmission() + "\n" +
				"Color: " + getColor() + "\n" +
				"Engine: " + getEngine() + "\n" +
				"Vin Number: " + getVinNumber() + "\n" +
				"Price: " + getPrice();
		
	}
}
