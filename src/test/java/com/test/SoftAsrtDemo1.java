package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsrtDemo1 {
//	** what is the difference b/w soft assertions and hard assertions.

//	When an assertion fails, don't throw an exception but record the failure.
	//Calling assertAll() will cause an exception to be thrown if at least one assertion 
	//failed.

	// IF we use soft assertions then it won;t stop the test execution even the assertion 
	//failure. 
	
	// we have to create an object for sfotAssert class then we can use the softAssert methods.
	
//	few : sft.assertEquals(actual, expected);
//	sft.assertNotEquals(actual, expected);
//	sft.assertTrue(condition);
//	sft.assertFalse(condition);
//	sft.assertNotNull(object);
//	sft.assertNull(object);
//	sft.assertSame(actual, expected, message);
//	sft.assertNotSame(actual, expected);
	
//	will throw the exception in your results ?
//	why it won;t throw,, if it is not throwing then what is the use of using this assertions.
//	we can use asssertAll() method.. if it fails then it will throw. 
	
	@Test
	public void test1() {
		SoftAssert sftasrt = new SoftAssert();

		Assert.assertEquals(true, true);
		System.out.println("m1 - first print statement.");
//		Assert.assertEquals(true, false);// hard assert
		sftasrt.assertEquals("Sasi", "sasi");
		sftasrt.assertNotEquals("Hyd", "Hyd");
		sftasrt.assertTrue(true, "this is false.");
		sftasrt.assertFalse(false, "my case failed because the value is true.");
		System.out.println("m1 - this is 2nd print statement.");
		sftasrt.assertAll();
	}

	@Test
	public void test2() {
		SoftAssert sftasrt = new SoftAssert();

		Assert.assertEquals(true, true);
		System.out.println("m2 - first print statement.");
//		Assert.assertEquals(true, false);// hard assert
		sftasrt.assertEquals(true, false);

		System.out.println("m2 - this is 2nd print statement.");

	}

}
