package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WebAppTest {
	@Test
	public void appsAdd() {
		assertEquals(6, WebApp.add(3, 5));
		
	}

}
