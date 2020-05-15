package model;
import java.util.*;

public class Motorcycle extends Vehicle implements GasolineControl{

	public final static int STANDAR=1;
	public final static int SPORT=2;
	public final static int SCOOTER=3;
	public final static int CROSS=4;
	
	public final static double ADDITIONAL_PRICE=0.04;
	public final static double USED_DISCOUNT=0.02;
	

	private int type;
	private double gasolineCapacity;
	private double consume;

	public Motorcycle(double basePrice, String brand, String model, int cylinder, double kilometraje, String plate, int type, double gasolineCapacity, double gasolineConsumption){
		
		super(basePrice, brand, model, cylinder, kilometraje, plate);
		this.type=type;
		this.gasolineCapacity=gasolineCapacity;
		this.consume=gasolineConsumption();
		
	}

	public Motorcycle(double basePrice, String brand, String model, int cylinder, int type, double gasolineCapacity, double gasolineConsumption){
		
		super(basePrice, brand, model, cylinder);
		this.type=type;
		this.gasolineCapacity=gasolineCapacity;
		this.consume=gasolineConsumption();
		
	}
	
	@Override
	public double calculateTotalPrice() {
		double totalPrice = super.calculateTotalPrice();
		
		if(!super.getBrandNew())
			totalPrice-=getBasePrice()*0.02;
		
		totalPrice+=getBasePrice()*0.04;
		setTotalPrice(totalPrice);		
		return totalPrice;
	}
	
	@Override
	public double gasolineConsumption() {
		return gasolineCapacity*(getCylinder()/90);
	}
	
	
	
}