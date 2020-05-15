package model;
import java.util.*;

public class Electrical extends Car implements BatteryControl{
	//constantes
	public final static boolean FAST = true;
	public final static boolean NORMAL = false;
	public final static double ADDITIONAL_PRICE = 0.2;
	
	//atributos
	private boolean chargeType;
	private double batteryDuration;
	private double batteryConsumption;
	
	//constructor
	public Electrical(double basePrice, String brand, String model, double cylinder, double kilometraje, String plate, boolean type, int doors, boolean polarized, boolean chargeType, double batteryDuration){
		
		super(basePrice, brand, model, cylinder, kilometraje, plate,type,doors,polarized);
		this.chargeType=chargeType;
		this.batteryDuration=batteryDuration;
		this.batteryConsumption=batteryConsumption();
		
	}
	//nuevo
	public Electrical(double basePrice, String brand, String model, double cylinder, boolean type, int doors, boolean polarized, boolean chargeType, double batteryDuration){
		
		super(basePrice, brand, model, cylinder,type,doors,polarized);
		this.chargeType=chargeType;
		this.batteryDuration=batteryDuration;
		this.batteryConsumption=batteryConsumption();
		
	}
	@Override
	public String description() {
		String charge = "";
		if(chargeType){
			charge = "Rapida";
		}else{
			charge = "Lenta";
		}
		String info = super.description()+
		"\nTipo de carga: "+charge+
		"\nDuracion de la bateria: "+batteryDuration+
		"\nConsumo de la bateria: "+batteryConsumption;
		return info;
	}
	
	@Override
	public double calculateTotalPrice() {
		double totalPrice = super.calculateTotalPrice();
		totalPrice+=getBasePrice()*0.2;
		setTotalPrice(totalPrice);		
		return totalPrice;
	}
	
	@Override
	public double batteryConsumption() {
		double result=0;
		if(chargeType){
			result=((batteryDuration+10)*(getCylinder()/100));
		}else{
			result=(batteryDuration+15)*(getCylinder()/100);
		}
		
		return result;	
	}
	
}