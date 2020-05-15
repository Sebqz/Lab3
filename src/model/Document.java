package model;
import java.util.*;

public abstract class Document{

	public final static int THIS_YEAR=2020;
	

	private double price;
	private int year;
	private int[][] image;
	

	public Document(double price, int year,int[][] image){
		this.price=price;
		this.year=year;
		this.image=image;
	}

	public Document(double price, int year){
		this.price=price;
		this.year=year;
		this.image=imageGenerator();
	}
	
	public int[][] imageGenerator(){
		Random rand = new Random();
		int rows = 0;
		int columns = 0;
		while(rows<3&&columns<3){
			rows=rand.nextInt(10);
			columns=rand.nextInt(10);
		}
		int[][] image = new int[rows][columns];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				image[i][j]=rand.nextInt(50);
			}
		}
		return image;
	}
	
	public boolean expired(){
		return year!=THIS_YEAR;
	}
	
	public int[][] getImage(){
		return image;
	}
}