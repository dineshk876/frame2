package com.testng;

import org.testng.annotations.Test;

import com.pom.BaseClass;

public class Sample extends BaseClass{
	@Test
	private void testcase1() {
		launch();
		url("https://www.facebook.com/");
		maximize();
		waits();
	}
}
