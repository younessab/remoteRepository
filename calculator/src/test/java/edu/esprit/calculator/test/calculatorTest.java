package edu.esprit.calculator.test;
import org.junit.Assert;
import org.junit.Test;
import edu.esprit.calculator.*;

public class calculatorTest {
	
	
	@Test
public void itShouldReturn10() {
	Long [] params= {1L,2L,3L,4L};
	calculator calc= new calculator();
	Long actual= calc.add(params);
	Long expected = 10L;
	Assert.assertEquals(expected, actual);
}
}

