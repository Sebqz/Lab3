package model;
import java.util.*;

public class Seller{
	//constantes
	public final static int CLIENTS=5;
	
	//atributos
	private String name;
	private String surname;
	private int id;
	private int sales;
	
	//relaciones
	private Client[] clients;
	
	//constructor
	public Seller(String name, String surname, int id){
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.sales = 0;
		clients = new Client[CLIENTS];
	}
	
	public void addClient(Client client){
		boolean added = false;
		for(int i=0;i<clients.length&&!added;i++){
			if(clients[i]==null){
				clients[i]=client;
				added=true;
			}
		}
	}
	
	public Client getClient(int id){
		boolean finded=false;
		Client client = null;
		for(int i=0;i<clients.length&&!finded;i++){
			if(clients[i].getId()==id){
				client=clients[i];
				finded=true;
			}
		}
		return client;
	}
	
}