package model;
import java.util.*;

public class Client{
	//atributos
	private String name;
	private String surname;
	private int id;
	private int numberPhone;
	private String email;
	private ArrayList<Vehicle> interested;
	
	//constructor
	public Client(String name, String surname, int id, int numberPhone, String email){
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.numberPhone=numberPhone;
		this.email=email;
		interested = new ArrayList<Vehicle>();
	}
	
	public void addInterestedVehicle(Vehicle vehicle){
		interested.add(vehicle);
	}
	
	public String infoInterested(){
		String result="\n---VEHICULOS DE INTERES - CLIENTE: "+name+"---";
		int count=1;
		result+="\nCarros a gasolina:\n";
		for(int i=0;i<interested.size();i++){
			if(interested.get(i) instanceof Gasoline){
				result += "\nVehiculo #"+(count)+":";
				result += interested.get(i).description();
				count++;
			}	
		}
		result+="\n\nCarros electricos:\n";
		for(int i=0;i<interested.size();i++){
			if(interested.get(i) instanceof Electrical){
				result += "\nVehiculo #"+(count)+":";
				result += interested.get(i).description();
				count++;
			}	
		}
		
		result+="\n\nCarros hybridos:\n";
		for(int i=0;i<interested.size();i++){
			if(interested.get(i) instanceof Hybrid){
				result += "\nVehiculo #"+(count)+":";
				result += interested.get(i).description();
				count++;
			}	
		}
		
		result+="\n\nMotos:\n";
		for(int i=0;i<interested.size();i++){
			if(interested.get(i) instanceof Motorcycle){
				result += "\nVehiculo #"+(count)+":";
				result += interested.get(i).description();
				count++;
			}	
		}
		return result;
	}
	
	public int getId(){
		return id;
	}
	
}