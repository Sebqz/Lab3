package model;
import java.util.*;

public abstract class Car extends Vehicle{
	//constantes
	public final static double USED_DISCOUNT = 0.1;
	public final static boolean SEDAN = true;
	public final static boolean TRUCK = false;
	
	//atributos
	private boolean type;
	private int doors;
	private boolean polarized;
	
	//constructor
	public Car(double basePrice, String brand, String model, double cylinder, double kilometraje, String plate, boolean type, int doors, boolean polarized){
		
		super(basePrice, brand, model, cylinder, kilometraje, plate);
		this.type=type;
		this.doors=doors;
		this.polarized=polarized;
	}
	//nuevo
	public Car(double basePrice, String brand, String model, double cylinder, boolean type, int doors, boolean polarized){
		
		super(basePrice, brand, model, cylinder);
		this.type=type;
		this.doors=doors;
		this.polarized=polarized;
		
	}
	
	@Override
	public String description() {
		String typ="";
		String pol="";
		if(type==SEDAN){
			typ="SEDAN";
		}else{
			typ="TRUCK";
		}
		if(polarized){
			pol="Si";
		}else{
			pol="No";
		}
		
		String info = super.description()+
		"\nTipo: "+typ+
		"\nPuertas: "+doors+
		"\nPolarizado: "+pol;
		return info;
	}
	
	
	@Override
	public double calculateTotalPrice() {
		double totalPrice = super.calculateTotalPrice();
		if(!super.getBrandNew())
			totalPrice-=getBasePrice()*0.1;
		
		setTotalPrice(totalPrice);
		return totalPrice;
	}
	
	
	
	
	
	
	
	
}