import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GeolocatorTest{


	@Test
	public void testFindGeopoliticalzone(){
		GeoLocator geolocator = new GeoLocator();
		String state = "Kano";
		String zone = geolocator.findGeopoliticalzone(state);
		assertEquals("North-West", zone);                                         
		

}


}