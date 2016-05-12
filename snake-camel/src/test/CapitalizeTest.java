package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class CapitalizeTest {

	@Test
	
	public void Capitalizeされてるか() {
		SnakeCamelUtil snc = new SnakeCamelUtil();
		String expected = "A";
		String actual = snc.capitalize("a");
		assertThat(actual,is(expected));
	
		
	}
}
