package junitprogram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test() {
		 JUnitClass JUnit=new JUnitClass();
		 int result=JUnit.add(30,20);
		 assertEquals(50,result);
	}

}
