package Disha.LOGER.Construct;


import java.util.*;
import java.util.logging.*;




 class Construct{

	 double totalConstructionCost;
	private static final Logger LOGGER=Logger.getLogger(App.class.getName());
	public void setConstructionData(int type,double area)
	{
		this.calculateTotalCost(type,area);
	}
	public void calculateTotalCost(int type,double houseArea) {
		int cost=0;
		if(type==1)
			cost=1200;
		if(type==2)
			cost=1500;
		if(type==3)
			cost=1800;
		if(type==4)
			cost=2500;
		totalConstructionCost=cost*houseArea;
	}
	public void displayResult()
	{
		LOGGER.info(""+this.totalConstructionCost);
	}
}

public class App {
	private static final Logger LOGGER=Logger.getLogger(App.class.getName());
	static {
		int type;
		double area;
		LOGGER.info("Enter Type For Construction type (1-4): \n");
		Scanner scan=new Scanner(System.in);
		type=scan.nextInt();
        LOGGER.info("Enter House Area \n");
		area=scan.nextDouble();
		Construct house=new Construct();
		house.setConstructionData(type, area);
		house.displayResult();
	}
  public static void main(String[] args) {

  }
}
