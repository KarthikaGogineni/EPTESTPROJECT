package junitprogram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcatTest {

	@Test
	void test() {
		 JUnitClass JUnit=new JUnitClass();
		 String result1=JUnit.concat("G.","Karthika");
		 assertEquals("G.Karthika",result1);
		 String result2=JUnit.concat("Varsha", " K");
		 assertEquals("Varsha K",result2);
	}

}
