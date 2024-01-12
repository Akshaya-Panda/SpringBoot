package com.example.demo_app;

import junit.framework.Assert;

import static org.junit.Assert.assertTrue;

import org.junit.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void shouldAnswerWithTrue()
	{
assertTrue(true);
Assert.assertEquals(true, OddEven.evenCheck(24));
}
}