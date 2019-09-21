import static org.junit.Assert.*;

import org.junit.Test;

public class NetworkingProfessionalTest {

	NetworkingProfessional networkPro = new NetworkingProfessional("Nadia");
	
	Tool plier = new Pliers("Crimping");
	
	Router router = new CiscoRouter(52); 
	
	@Test
	public void shouldReturnTrue() {
		boolean result = networkPro.fixRouter(router, plier);
		assertTrue("should be able to fix a router", result);
	}

}
