package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


import snakecamel.SnakeCamelUtil;

public class CamelTest {

@Test
	
	public void SnakeがCamelに変換される() {
		SnakeCamelUtil snc = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = snc.snakeToCamelcase("abc_def");
		assertThat(actual,is(expected));
	
		
	}

}
