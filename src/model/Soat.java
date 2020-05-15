package model;
import java.util.*;

public class Soat extends Document{
	
	private double coverageAmount;

	public Soat(double price, int year,int[][] image, double coverageAmount){
		super(price,year,image);
		this.coverageAmount=coverageAmount;
	}

	public Soat(double price, int year, double coverageAmount){
		super(price,year);
		this.coverageAmount=coverageAmount;
	}
	
	
	
	
	
}