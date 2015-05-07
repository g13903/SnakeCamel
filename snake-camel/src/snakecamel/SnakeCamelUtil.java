package snakecamel;

public class SnakeCamelUtil {

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
		int i = 0;
		for (i = 0; i < camelcase.length()-1; i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {
				if (i!= 0) {
					sb.append(uncapitalize(camelcase.substring(j,i)));
					sb.append("_");
					j=i;
				}
			}
		}
		i++;
		sb.append(uncapitalize(camelcase.substring(j,i)));
		return new String(sb);
	}
	
	public static String capitalize(String s) {
		if (s.equals("")) return "";
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	public static String uncapitalize(String s) {
		if(s.equals("")) return "";
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
}
