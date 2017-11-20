import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.eisgroup.javaexam.factory.Color;
import com.eisgroup.javaexam.factory.Transportation;

public class ProduceCar extends Transportation {
	double price;

	public ProduceCar(String make, String model, double price, Color color) {
		super(make, model, price, color);
		this.price=price;
		
		
		//LOGGER
		Logger logger = Logger.getLogger("");  
	    FileHandler fh;  
	    try {  

	        // This block configure the logger with handler and formatter  
	        fh = new FileHandler("MyLog.txt");  
	        logger.addHandler(fh);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        fh.setFormatter(formatter);  

	        // the following statement is used to log any messages  
	        logger.info("Start making car "+ make+"           "+model+"          "+price+"       "+color+"    ");  
	       
	    } catch (SecurityException e) {  
	        e.printStackTrace();  
	    } catch (IOException e) {  
	        e.printStackTrace();  
	    }  
	    
	    logger.warning("car finished      "+ make+"           "+model+"          "+price+"       "+color+"    ");  
	    
		
	}
	@Override
	public double getFinalPrice() {
		// TODO Auto-generated method stub
		return this.price*1.21;
	}
	
	
}
