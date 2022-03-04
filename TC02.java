package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification1 {
	@Test
	public void test() {
		String str=null;
		Assert.assertNull(str);
	}
	@Test
	public void test1() {
		String str="hi";
		Assert.assertNull(str);
	}
	
	@Test
	public void test2() {
		String str="hii";
		Assert.assertNotNull(str);
	}
	@Test
	public void test3() {
		String str=null;
		Assert.assertNotNull(str);
	}

}
