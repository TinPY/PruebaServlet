package test;

import main.java.com.random.Aleatorio;

import org.junit.Assert;
import org.junit.Test;

public class RdmTest {

	
	 @Test
	 public void testRandomPass() {
		 Aleatorio obj = new Aleatorio();
		 //String s = obj.generarNumeroAleatorio();
		 //Assert.assertEquals(s, s);
	}
	 @Test
	 public void testRandomFail() {
		 Aleatorio obj = new Aleatorio();
		 //String s = obj.generarNumeroAleatorio();
		 //Assert.assertEquals("126", s);
	}
}
