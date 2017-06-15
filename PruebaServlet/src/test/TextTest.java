package test;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.formulario.Formulario;

public class TextTest {
	
	@Test
	 public void textPass() {
		Formulario obj = new Formulario();
//		 String s = obj.getText("env1");
//		 Assert.assertEquals(s, s);
	}
	 @Test
	 public void textFail() {
		 Formulario obj = new Formulario();
//		 String s = obj.getText("QA");
//		 Assert.assertEquals("PROD", s);
	}

}
