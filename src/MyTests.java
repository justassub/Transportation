import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.eisgroup.javaexam.factory.Color;

public class MyTests {
	
	

	@Test
	public void makesBoat() {
		ProduceBoat boat = new ProduceBoat("Testuoju","Testavimas",90000,Color.BLACK,9.0);
		
		assertEquals("BLACK",boat.color);
	}
	
	@Test
	public void size() {
		ProduceBoat boat = new ProduceBoat("Testuoju","Testavimas",90000,Color.BLACK,8.0);
		
		assertEquals(8.0,boat.getLength(),0.01);

}
	
	@Test
	public void fullPrice() {
		
			ProduceBoat boat = new ProduceBoat("Testuoju","Testavimas",100000,Color.BLACK,10.0);
			
			assertEquals(121000,boat.getFinalPrice(),0.01);
	}
	
	@Test
	public void CarfullPrice() {
		
			ProduceCar car = new ProduceCar("Testuoju","Testavimas",100000,Color.BLACK);
			
			assertEquals(121000,car.getFinalPrice(),0.01);
	}
	
	
	
}