package model;
import java.util.*;

public class Hybrid extends Car implements BatteryControl,GasolineControl{
	//constantes
	//electrical
	public final static boolean FAST = true;
	public final static boolean NORMAL = false;
	
	//gasoline
	public final static int EXTRA = 1;
	public final static int ORDINARY = 2;
	public final static int DIESEL = 3;
	
	public final static double ADDITIONAL_PRICE = 0.15;
	
	//atributos
	private boolean chargeType;
	private double batteryDuration;
	private double batteryConsumption;
	
	
	private double gasolineConsumption;
	private double tankCapacity;
	private int gasolineType;
	
	//constructor
	public Hybrid(double basePrice, String brand, String model, int cylinder, double kilometraje, String plate, boolean type, int doors, boolean polarized, boolean chargeType, double batteryDuration, double tankCapacity, int gasolineType){
		
		super(basePrice, brand, model, cylinder, kilometraje, plate,type,doors,polarized);
		
		this.chargeType=chargeType;
		this.batteryDuration=batteryDuration;
		this.batteryConsumption=batteryConsumption();
		
		this.tankCapacity=tankCapacity;
		this.gasolineType=gasolineType;
		this.gasolineConsumption=gasolineConsumption();
	}
	
	//nuevo
	public Hybrid(double basePrice, String brand, String model, int cylinder, boolean type, int doors, boolean polarized, boolean chargeType, double batteryDuration, double batteryConsumption, double tankCapacity, int gasolineType){
		
		super(basePrice, brand, model, cylinder,type,doors,polarized);
		
		this.chargeType=chargeType;
		this.batteryDuration=batteryDuration;
		this.batteryConsumption=batteryConsumption();
		
		this.tankCapacity=tankCapacity;
		this.gasolineType=gasolineType;
		this.gasolineConsumption=gasolineConsumption();
	}
	
	@Override
	public String description() {
		String gasoline = "";
		if(gasolineType==EXTRA){
			gasoline = "Extra";
		}else if(gasolineType==ORDINARY){
			gasoline = "Ordinaria";
		}else if(gasolineType==DIESEL){
			gasoline = "Diesel";
		}
		String charge = "";
		if(chargeType){
			charge = "Rapida";
		}else{
			charge = "Lenta";
		}
		String info = super.description()+
		"\nCapacidad en el tanque: "+tankCapacity+
		"\nTipo de gasolina: "+gasoline+
		"\nConsumo de gasolina: "+gasolineConsumption+
		"\nTipo de carga: "+charge+
		"\nDuracion de la bateria: "+batteryDuration+
		"\nConsumo de la bateria: "+batteryConsumption;
		return info;
	}
	
	@Override
	public double calculateTotalPrice() {
		double totalPrice = super.calculateTotalPrice();
		totalPrice+=getBasePrice()*0.15;
		setTotalPrice(totalPrice);		
		return totalPrice;
	}
	
	@Override
	public double gasolineConsumption() {
		return tankCapacity*(getCylinder()/110);
	}
	
	@Override
	public double batteryConsumption() {
		double result=0;
		if(chargeType){
			result=batteryDuration*(getCylinder()/100);
		}else{
			result=(batteryDuration+5)*(getCylinder()/100);
		}
		return result;	
	}
	
}