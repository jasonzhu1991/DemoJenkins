package edu.gatech.jason.demo_jenkins;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

/**
 * Demo for unit tests.
 */
public class AppTest {

	@Test
	public void testPass() {
		Assert.assertTrue(true);
	}

	@Test
	public void testRandom() {
		Assert.assertTrue(new Random().nextBoolean());
	}

}
