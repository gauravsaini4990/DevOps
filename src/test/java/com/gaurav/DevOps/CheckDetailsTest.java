package com.gaurav.DevOps;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;


public class CheckDetailsTest {

	@Test
	public void Name(){
		String name ="gaurav" ;
		Assert.assertEquals("gaurav", name);
		Assert.assertNotSame("saini", name);
	}
	
	@Test
	public void Age() {
		String Age = "27" ;
		Assert.assertEquals(27,Integer.parseInt(Age));
		Assert.assertNotSame(25, Age);
	}
	
}