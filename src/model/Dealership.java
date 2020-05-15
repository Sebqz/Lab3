package model;
import java.util.*;

public class Dealership{
	//constantes
	public final static int SELLERS=10;
	public final static int PARKING_COLUMNS=5;
	public final static int PARKING_LINES=10;
	
	//atributos
	private String name;
	private int nit;
	private int sales;
	private double earnings;
	
	//relaciones
	private Seller[] sellers;
	private ArrayList<Vehicle> vehicles;
	private Car[][] parking;
	
	//constructor
	public Dealership(String name, int nit){
		this.name = name;
		this.nit = nit;
		this.sales = 0;
		this.earnings = 0;
		
		sellers = new Seller[SELLERS];
		vehicles = new ArrayList<Vehicle>();
		parking = new Car[PARKING_LINES][PARKING_COLUMNS];
	}
	
	public void addSeller(Seller seller){
		for(int i=0;i<sellers.length;i++){
			if(sellers[i]==null)
				sellers[i]=seller;
		}
	}
	
	public void addVehicle(Vehicle vehicle) {
		//si es viejo lo agrega al parking
			vehicles.add(vehicle);
	}
	
	public String infoVehicles(){
		String result="\n---CATALOGO---";
		int count=1;
		result+="\nCarros a gasolina:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Gasoline){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		result+="\n\nCarros electricos:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Electrical){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		
		result+="\n\nCarros hybridos:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Hybrid){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		
		result+="\n\nMotos:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Motorcycle){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		return result;
	}
	
	public String showNewInfo(){
		String result="\n---CATALOGO:NUEVOS---";
		int count=1;
		result+="\nCarros a gasolina:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Gasoline&&vehicles.get(i).getBrandNew()){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		result+="\n\nCarros electricos:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Electrical&&vehicles.get(i).getBrandNew()){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		
		result+="\n\nCarros hybridos:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Hybrid&&vehicles.get(i).getBrandNew()){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		
		result+="\n\nMotos:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Motorcycle&&vehicles.get(i).getBrandNew()){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		return result;
	}
	
	public String showNotNewInfo(){
		String result="\n---CATALOGO:USADOS---";
		int count=1;
		result+="\nCarros a gasolina:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Gasoline&&!(vehicles.get(i).getBrandNew())){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		result+="\n\nCarros electricos:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Electrical&&!(vehicles.get(i).getBrandNew())){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		
		result+="\n\nCarros hybridos:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Hybrid&&!(vehicles.get(i).getBrandNew())){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		
		result+="\n\nMotos:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Motorcycle&&!(vehicles.get(i).getBrandNew())){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		return result;
	}
	
	public String showGasolineInfo(){
		String result="\n---CATALOGO:GASOLINA---";
		int count=1;
		result+="\nCarros a gasolina:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Gasoline){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		
		result+="\n\nCarros hybridos:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Hybrid){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		
		result+="\n\nMotos:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Motorcycle){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		return result;
	}
	
	public String showElectricalInfo(){
		String result="\n---CATALOGO:ELECTRICOS---";
		int count=1;
		result+="\n\nCarros electricos:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Electrical){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		result+="\n\nCarros hybridos:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Hybrid){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		return result;
	}
	public String showHybridInfo(){
		String result="\n---CATALOGO:HIBRIDOS---";
		int count=1;
		result+="\n\nCarros hybridos:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Hybrid){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		return result;
	}
	public String showMotorcycleInfo(){
		String result="\n---CATALOGO:MOTOS---";
		int count=1;
		result+="\n\nMotos:\n";
		for(int i=0;i<vehicles.size();i++){
			if(vehicles.get(i) instanceof Motorcycle){
				result += "\nVehiculo #"+(count)+":";
				result += vehicles.get(i).description();
				count++;
			}	
		}
		return result;
	}
}