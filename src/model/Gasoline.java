package model;
import java.util.*;

public class Gasoline extends Car implements GasolineControl{
	//constantes
	public final static int EXTRA = 1;
	public final static int ORDINARY = 2;
	public final static int DIESEL = 3;
	public final static double ADDITIONAL_PRICE = 0;
	
	//atributos
	private double consume;
	private double tankCapacity;
	private int gasolineType;
	
	//constructor
	public Gasoline(double basePrice, String brand, String model, double cylinder, double kilometraje, String plate, boolean type, int doors, boolean polarized, double tankCapacity, int gasolineType){
		
		super(basePrice, brand, model, cylinder, kilometraje, plate,type,doors,polarized);
		
		this.tankCapacity=tankCapacity;
		this.gasolineType=gasolineType;
		this.consume=gasolineConsumption();
		
	}
	
	//nuevo
	public Gasoline(double basePrice, String brand, String model, double cylinder, boolean type, int doors, boolean polarized, double tankCapacity, int gasolineType){
		
		super(basePrice, brand, model,cylinder,type,doors,polarized);
		
		this.tankCapacity=tankCapacity;
		this.gasolineType=gasolineType;
		this.consume=gasolineConsumption();
		
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
		
		String info = super.description()+
		"\nCapacidad en el tanque: "+tankCapacity+
		"\nTipo de gasolina: "+gasoline+
		"\nConsumo: "+consume;
		return info;
	}
	
	
	@Override
	public double gasolineConsumption() {
		return tankCapacity*(getCylinder()/100);
	}
	
	
}