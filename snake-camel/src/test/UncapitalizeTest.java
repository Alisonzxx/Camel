package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class UncapitalizeTest {

	@Test
	public void UnCapitalizeされてるか() {
		SnakeCamelUtil snc = new SnakeCamelUtil();
		String expected = "a";
		String actual = snc.uncapitalize("A");
		assertThat(actual,is(expected));
	
		
	}

}
