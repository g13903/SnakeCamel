package test;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import snakecamel.SnakeCamelUtil;

public class SnakeCamelTest {

	@Test
	public void capitalize�ɋ󕶎���^����() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = " ";
		String actual = sc.capitalize(" ");
		assertThat(actual, is(expect));
	}
	@Test
	public void capitalize�ɏ������̃f�[�^�ꕶ����^����() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "A";
		String actual = sc.capitalize("a");
		assertThat(actual, is(expect));
	}
	@Test
	public void capitalize�ɂ��ׂď������̃f�[�^��^����() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "Xyz";
		String actual = sc.capitalize("xyz");
		assertThat(actual, is(expect));
	}
	
	//-----------------------
	@Test
	public void uncapitalize�󕶎���^����() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = " ";
		String actual = sc.uncapitalize(" ");
		assertThat(actual, is(expect));
	}
	@Test
	public void uncapitalize�ɑ啶��1������^����() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "a";
		String actual = sc.uncapitalize("A");
		assertThat(actual, is(expect));
	}
	@Test
	public void uncapitalize�ɍŏ����啶���̃f�[�^��^����(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "abcde";
		String actual = sc.uncapitalize("Abcde");
		assertThat(actual,is(expect));
	}
	
	//-------------------------
	@Test
	public void snakeToCamel�ɏ����������̃f�[�^��^����(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "Abc";
		String actual = sc.snakeToCamelcase("abc");
		assertThat(actual,is(expect));
	}
	@Test
	public void snakeToCamel�ɃA���_�[�o�[�P���܂ރf�[�^��^����(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "AbcDef";
		String actual = sc.snakeToCamelcase("abc_def");
		assertThat(actual,is(expect));
	}
	@Test
	public void snakeToCamel�ɃA���_�[�o�[2�܂ރf�[�^��^����(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "AbcDefGh";
		String actual = sc.snakeToCamelcase("abc_def_gh");
		assertThat(actual,is(expect));
	}
	@Test
	public void snakeToCamel�ɘA���A���_�[�o�[���܂ރf�[�^��^����(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "AbcDefGh";
		String actual = sc.snakeToCamelcase("abc__def___gh");
		assertThat(actual,is(expect));
	}
	@Test
	public void snakeToCamel�ɍŏ����A���_�[�o�[�̃f�[�^��^����(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "AbcDef";
		String actual = sc.snakeToCamelcase("_abc_def");
		assertThat(actual,is(expect));
	}
	
	//-------------------------------------------
	
	

	@Test
	public void camelToSnake�ɍŏ����啶���̃f�[�^��^����(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "abc";
		String actual = sc.camelToSnakecase("Abc");
		assertThat(actual,is(expect));
	}
	
	@Test
	public void camelToSnake��2���Ԃ̃f�[�^��^����(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "abc_def";
		String actual = sc.camelToSnakecase("AbcDef");
		assertThat(actual,is(expect));
	}
	

	@Test
	public void camelToSnake��3���Ԃ̃f�[�^��^����(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "abc_def_gh";
		String actual = sc.camelToSnakecase("AbcDefGh");
		assertThat(actual,is(expect));
	}
}
