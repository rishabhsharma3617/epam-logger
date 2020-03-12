package Disha.LOGER.SICI;

import java.util.logging.Logger;



 abstract class Interest{
	double principle;
	double rate;
	double timePeriod;
	public static final Logger LOGGER=Logger.getLogger(App.class.getName());
	void setData(double principle,double rate,double timePeriod){}
	void displayResult(){}
}

class CI extends Interest{
	private double CIn;
	public void setData(double principle,double rate,double timePeriod)
	{
		this.principle=principle;
		this.timePeriod=timePeriod;
		this.rate=(rate);
	}
	public void calculateCI()
	{
		double amount=principle*Math.pow((1+rate/100),timePeriod);
		CIn=amount-principle;
	}
	public void displayResult() {
		LOGGER.info(""+CIn);
	}
}


 class SI extends Interest{
	private double SIn;
	public void setData(double principle,double rate,double timePeriod)
	{
		this.principle=principle;
		this.timePeriod=timePeriod;
		this.rate=(rate);
	}
	public void calculateSI()
	{
		SIn=principle*rate*timePeriod/100;
	}
	public void displayResult() {
		LOGGER.info(""+SIn);
	}
}

public class App
{

   static {
	    SI si=new SI();
	    CI ci=new CI();
	    si.setData(2500, 5.5, 5);
	    si.calculateSI();
	    si.displayResult();
            ci.setData(2500, 5.5, 5);
	    ci.calculateCI();
            ci.displayResult();
   }
   public static void main( String[] args )
    {
    }
}
