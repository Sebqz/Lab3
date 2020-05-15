package model;
import java.util.*;

public abstract class Vehicle {
	//constantes
	public final static int OWNERS=1;
	public final static double UNDOCUMENT_PRICE=500000;
	
	//atributos
	private double basePrice;
	private double totalPrice;
	private String brand;
	private String model;
	private double cylinder;
	private double kilometraje;
	private boolean brandNew;
	private String plate;
	
	//relaciones
	private Client[] owner;
	private ArrayList<Document> documents;
	
	//constructor
	public Vehicle(double basePrice, String brand, String model, double cylinder, double kilometraje, String plate){
		this.basePrice=basePrice;
		this.brand=brand;
		this.model=model;
		this.cylinder=cylinder;
		this.kilometraje=kilometraje;
		this.brandNew=false;
		this.plate=plate;
		
		owner = new Client[OWNERS];
		documents = new ArrayList<Document>();
		
	}
	//nuevo
	public Vehicle(double basePrice, String brand, String model, double cylinder){
		this.basePrice=basePrice;
		this.brand=brand;
		this.model=model;
		this.cylinder=cylinder;
		this.kilometraje=0;
		this.brandNew=true;
		this.plate="";
		
		owner = new Client[OWNERS];
		documents = new ArrayList<Document>();
		
	}
	
	public String description() {
		String n="";
		if(brandNew){
			n="Si";
		}else{
			n="No";
		}
		if(plate==""){
			plate="No tiene";
		}
		String info = "\nPrecio base: "+basePrice+
		"\nPrecio total: " +calculateTotalPrice()+
		"\nMarca: " + brand+
		"\nModelo: " + model+
		"\nCilindraje: " + cylinder+
		"\nKilometraje: "+ kilometraje+
		"\nNuevo: " +n+
		"\nPlaca: " + plate;
		return info;
	}
	
	public void addOwner(Client client){
		if(owner[0]==null){
			owner[0]=client;
		}else{
			System.out.println("Ya tiene dueño");
		}
	}
	
	public void addDocument(Document document) {
		documents.add(document);
	}
	
	public boolean isUndocument(){
		int countDocuments = 0;
		boolean result = true;
		for(int i=0;i<documents.size()	;i++){
			if (documents.get(i) instanceof TechnoReview){
				if(!documents.get(i).expired()){
					countDocuments++;
				}
			}else{
				if(!documents.get(i).expired()){
					countDocuments++;
				}
			}
		}
		if(countDocuments>=2){
			result=false;
		}
		return result;
	}
	

	
	public double calculateTotalPrice(){
		double totalPrice = 0;
		if(isUndocument()){
			totalPrice+=500000+basePrice;
		}else{
			totalPrice=basePrice;
		}
		
		return totalPrice;
	}
	
	public void setTotalPrice(double totalPrice){
		this.totalPrice=totalPrice;
	}
	
	public boolean getBrandNew(){
		return brandNew;
	}
	
	public double getBasePrice(){
		return basePrice;
	}
	
	public double getCylinder(){
		return cylinder;
	}
	
	public double getTotalPrice(){
		return totalPrice;
	}
	
}