import static org.junit.Assert.*;

import org.junit.Test;

public class PlumbingProfessionalTest {
	
	PlumbingProfessional prof = new PlumbingProfessional("Queen");
	
	Tool wrench = new Wrench("spanner");
	
	Pipe roundPipe = new PvcPipe(0.9f, 03f, ""); 

	@Test
	public void shouldReturnTrue() {
		boolean result = prof.fixPipe(roundPipe, wrench);
		assertTrue("should be able to fix a pipe", result);
	}

}
