package LAB11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class primetest {

	@Test
	void test() {
		JUnitTesting obj=new JUnitTesting();
		boolean output=obj.isOdd(5);
		assertEquals(true, output);
	}

}
