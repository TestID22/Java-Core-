package test;
import org.junit.Test;

import com.september.*;


import junit.framework.TestCase;

public class TestMain extends TestCase{
	Hero a = new Atlantis("Stiven");
	@Test
	public void testHero() {
		String actual = a.getName();
		assertEquals("Stiven", actual);
		
	}

}
