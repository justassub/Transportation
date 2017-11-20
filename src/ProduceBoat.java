import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.eisgroup.javaexam.factory.Color;
import com.eisgroup.javaexam.factory.Transportation;

public class ProduceBoat extends Transportation{
	
	Logger logger = Logger.getLogger("MyLog.txt"); 
	FileHandler fh; 

	String make;
	String model;
	double price;
	Color color;
	double length;
	
	
	
	public ProduceBoat(String make, String model, double price, Color color) {
		super(make, model, price, color);
		
		this.make=make;
		this.model=model;
		this.price=price;
		this.color=color;
		
			
		
		
	}


	public ProduceBoat(String make, String model, double price, Color color, double length) {
		
		super(make, model, price, color);
		
		this.make=make;
		this.model=model;
		this.price=price;
		this.color=color;
		this.length=length;
		
		
		
		Logger logger = Logger.getLogger("");  
	    FileHandler fh;  

	    try {  

	        // This block configure the logger with handler and formatter  
	        fh = new FileHandler("MyLog.txt");  
	        logger.addHandler(fh);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        fh.setFormatter(formatter);  

	        // the following statement is used to log any messages  
	        logger.info("Start making boat");  
	       
	    } catch (SecurityException e) {  
	        e.printStackTrace();  
	    } catch (IOException e) {  
	        e.printStackTrace();  
	    }  
	    
	    logger.warning("boat finished      "+ make+"           "+model+"          "+price+"       "+color+"    "+length);  
	    
		
	}
	
	public double getLength() {
		return this.length;
	}



	@Override
	public double getFinalPrice() {
		// TODO Auto-generated method stub
		return price*1.21;
	}


}
