package pack3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilImp implements Util {

	public int add(int a, int b) {
		
		return a+b;
	}

	public int mult(int a, int b) {
		
		return a*b;
	}
public int div(int a, int b) {
		
		return a/b;
	}
public int sous(int a, int b) {
	
	return a-b;
}

	public int max(int a, int b) {
		if (a>b) return a;
		else return b;
	}

	public int min(int a, int b) {
		if (a<b) return a;
		else return b;
		
	}
	
	@Test
	public void testmin() {
		assertEquals(6,min(20,6));
	}
	
	@Test
	public void testmax() {
		assertEquals(30,max(2,30));
	}

}
