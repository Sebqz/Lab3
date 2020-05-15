package ui;
import model.*;
public class Main {
	public static void main(String[] args) {
		
		Dealership dealership = new Dealership("ejemplo",234);
		Seller seller1 = new Seller("uno","unol",234);
		
		dealership.addSeller(seller1);
		
		Electrical electrical1 = new Electrical(100000,"marca","modelo",2,true,4,true,true,3);
		
		Gasoline gasoline1 = new Gasoline(100000,"marca","modelo",2,24,"placa",true,4,true,3,2);
		
		Hybrid hybrid1 = new Hybrid(100000,"marca","modelo",2,true,4,true,true,5,2,5,1);
		
		Motorcycle moto1 = new Motorcycle(100000,"marca","modelo",2,2,4,1);
				
		dealership.addVehicle(electrical1);
		
		dealership.addVehicle(gasoline1);
		
		dealership.addVehicle(hybrid1);
		
		dealership.addVehicle(moto1);
		
		TechnoReview techno = new TechnoReview(100,2020,4);
		Soat soat = new Soat(200,2020,3);
		
		TechnoReview techno2 = new TechnoReview(100,2020,4);
		Soat soat2 = new Soat(200,2020,3);
		
		electrical1.addDocument(techno);
		electrical1.addDocument(soat);
		
		gasoline1.addDocument(techno2);
		gasoline1.addDocument(soat2);
		
		hybrid1.addDocument(techno2);
		hybrid1.addDocument(soat2);
		
		moto1.addDocument(techno2);
		moto1.addDocument(soat2);
		


		Client client1 = new Client("name","surname",123,2,"email");
		
		seller1.addClient(client1);
		electrical1.addOwner(client1);
		
		client1.addInterestedVehicle(electrical1);
		System.out.println(electrical1.description());
		System.out.println(gasoline1.description());
		System.out.println(hybrid1.description());
		System.out.println(dealership.infoVehicles());
		System.out.println(dealership.showNewInfo());
		System.out.println(dealership.showNotNewInfo());
		System.out.println(dealership.showGasolineInfo());
		System.out.println(dealership.showHybridInfo());
		System.out.println(dealership.showMotorcycleInfo());
		
		Client client = seller1.getClient(123);
		System.out.println(client.infoInterested());

  }

}
