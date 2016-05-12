package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class SnakeTest {


@Test
	
	public void CamelがSnakeに変換される() {
		SnakeCamelUtil snc = new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = snc.camelToSnakecase("AbcDef");
		assertThat(actual,is(expected));
	
		
	}
}
