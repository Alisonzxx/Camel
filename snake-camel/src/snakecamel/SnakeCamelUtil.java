package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SnakeCamelUtil {
public static void main(String[]args){
	SnakeCamelUtil snc = new SnakeCamelUtil();
	snc.SnakeがCamelに変換される();
	snc.CamelがSnakeに変換される();
	snc.Capitalizeされてるか();
	snc.UnCapitalizeされてるか();
	

	
	
	}
			
		public static String snakeToCamelcase(String snake_case) {
			String[] words = snake_case.split("_");
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < words.length; i++) {
				sb.append(capitalize(words[i]));
			}
			return new String(sb);
		}	
	 
		public static String camelToSnakecase(String camelcase) {
			StringBuilder sb = new StringBuilder();
			int j = 0;
			for (int i = 0; i < camelcase.length(); i++) {
				char c = camelcase.charAt(i);
				if (Character.isUpperCase(c)) {
					sb.append(camelcase.substring(j, i));
					if (sb.length() > 0) {
						sb.append("_");
					}
					sb.append(Character.toLowerCase(c));
					j = i+1;
				}
			}
			sb.append(camelcase.substring(j));
			return new String(sb);
		}
	
		public static String capitalize(String s) {
			char first = s.charAt(0);
			char upperFirst = Character.toUpperCase(first);
			String rest = s.substring(1);
			return upperFirst + rest;
		}

		public static String uncapitalize(String s) {
			char first = s.charAt(0);
			char lowerFirst = Character.toLowerCase(first);
			String rest = s.substring(1);
			return lowerFirst + rest;
		}	
		public void SnakeがCamelに変換される() {
			SnakeCamelUtil snc = new SnakeCamelUtil();
			String expected = "AbcDef";
			String actual = snc.snakeToCamelcase("abc_def");
			assertThat(actual,is(expected));
		
			
		}
		public void CamelがSnakeに変換される() {
			SnakeCamelUtil snc = new SnakeCamelUtil();
			String expected = "abc_def";
			String actual = snc.camelToSnakecase("AbcDef");
			assertThat(actual,is(expected));
		
			
		}
		public void Capitalizeされてるか() {
			SnakeCamelUtil snc = new SnakeCamelUtil();
			String expected = "A";
			String actual = snc.capitalize("a");
			assertThat(actual,is(expected));
		
			
		}
		public void UnCapitalizeされてるか() {
			SnakeCamelUtil snc = new SnakeCamelUtil();
			String expected = "a";
			String actual = snc.uncapitalize("A");
			assertThat(actual,is(expected));
		
			
		}

	}		
