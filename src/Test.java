


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.eisgroup.javaexam.factory.Color;
import com.eisgroup.javaexam.factory.TransportationFactory;
import com.eisgroup.javaexam.factory.test.BaseTransportationFactoryTest;

public class Test extends BaseTransportationFactoryTest {

	@Override
	protected TransportationFactory getTransportationFactory() {
		// TODO Auto-generated method stub
		return new FactoryMy();
	}
	
	
	
	

}
