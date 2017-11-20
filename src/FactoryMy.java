import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

import org.hamcrest.Factory;

import com.eisgroup.javaexam.factory.Color;
import com.eisgroup.javaexam.factory.Transportation;
import com.eisgroup.javaexam.factory.TransportationFactory;

public class FactoryMy implements TransportationFactory {
	

	
	Transportation factory;

	@Override
	public Transportation produceBoat(String make, String model, double price, Color color, double length) {
		
		 factory = new ProduceBoat(make,model,price,color,length);
			
		
		return factory ;
	}

	@Override
	public Transportation produceCar(String make, String model, double price, Color color) {
		
		factory = new ProduceCar(make,model,price,color);
			
			
		
		return factory;
	}

}

