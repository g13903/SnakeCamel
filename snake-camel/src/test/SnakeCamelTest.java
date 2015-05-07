package test;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import snakecamel.SnakeCamelUtil;

public class SnakeCamelTest {

	@Test
	public void capitalizeに空文字を与える() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = " ";
		String actual = sc.capitalize(" ");
		assertThat(actual, is(expect));
	}
	@Test
	public void capitalizeに小文字のデータ一文字を与える() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "A";
		String actual = sc.capitalize("a");
		assertThat(actual, is(expect));
	}
	@Test
	public void capitalizeにすべて小文字のデータを与える() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "Xyz";
		String actual = sc.capitalize("xyz");
		assertThat(actual, is(expect));
	}
	
	//-----------------------
	@Test
	public void uncapitalize空文字を与える() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = " ";
		String actual = sc.uncapitalize(" ");
		assertThat(actual, is(expect));
	}
	@Test
	public void uncapitalizeに大文字1文字を与える() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "a";
		String actual = sc.uncapitalize("A");
		assertThat(actual, is(expect));
	}
	@Test
	public void uncapitalizeに最初が大文字のデータを与える(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "abcde";
		String actual = sc.uncapitalize("Abcde");
		assertThat(actual,is(expect));
	}
	
	//-------------------------
	@Test
	public void snakeToCamelに小文字だけのデータを与える(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "Abc";
		String actual = sc.snakeToCamelcase("abc");
		assertThat(actual,is(expect));
	}
	@Test
	public void snakeToCamelにアンダーバー１つを含むデータを与える(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "AbcDef";
		String actual = sc.snakeToCamelcase("abc_def");
		assertThat(actual,is(expect));
	}
	@Test
	public void snakeToCamelにアンダーバー2つ含むデータを与える(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "AbcDefGh";
		String actual = sc.snakeToCamelcase("abc_def_gh");
		assertThat(actual,is(expect));
	}
	@Test
	public void snakeToCamelに連続アンダーバーを含むデータを与える(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "AbcDefGh";
		String actual = sc.snakeToCamelcase("abc__def___gh");
		assertThat(actual,is(expect));
	}
	@Test
	public void snakeToCamelに最初がアンダーバーのデータを与える(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "AbcDef";
		String actual = sc.snakeToCamelcase("_abc_def");
		assertThat(actual,is(expect));
	}
	
	//-------------------------------------------
	
	

	@Test
	public void camelToSnakeに最初が大文字のデータを与える(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "abc";
		String actual = sc.camelToSnakecase("Abc");
		assertThat(actual,is(expect));
	}
	
	@Test
	public void camelToSnakeに2こぶのデータを与える(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "abc_def";
		String actual = sc.camelToSnakecase("AbcDef");
		assertThat(actual,is(expect));
	}
	

	@Test
	public void camelToSnakeに3こぶのデータを与える(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expect = "abc_def_gh";
		String actual = sc.camelToSnakecase("AbcDefGh");
		assertThat(actual,is(expect));
	}
}
