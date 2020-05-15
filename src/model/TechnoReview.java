package model;
import java.util.*;

public class TechnoReview extends Document{
	private double gasLevels;
	
	public TechnoReview(double price, int year,int[][] image, double gasLevels){
		super(price,year,image);
		this.gasLevels=gasLevels;
	}
	
	public TechnoReview(double price, int year, double gasLevels){
		super(price,year);
		this.gasLevels=gasLevels;
	}
	
	
}