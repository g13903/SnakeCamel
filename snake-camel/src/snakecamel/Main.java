package snakecamel;
import java.util.*;

public class Main {
	public static void main(String args[]){
	System.out.println("•¶Žš—ñ‚ð“ü—Í‚µ‚Ä‰º‚³‚¢");
	Scanner in = new Scanner(System.in);
	String scn = in.next();
	
	SnakeCamelUtil sc = new SnakeCamelUtil();
	char c = scn.charAt(0);
	String answer;
	if (Character.isUpperCase(c)) {
		answer = sc.camelToSnakecase(scn);
	}
	else{
		answer = sc.snakeToCamelcase(scn);
	}
	System.out.println(answer);
	}
}
