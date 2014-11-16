package org.rsm.quickstart;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class HelloServiceIT
{
	private static HelloService helloService;

	@BeforeClass
	public static void setup()
	{
		helloService = new HelloService();
	}
	@AfterClass
	public static void teardown()
	{
		helloService = null;
	}

	@Test
    public void testSayHello() {
		String name = "Siva";
		String hello = helloService.sayHello(name);
		Assert.assertEquals("Hello Siva", hello);
	}
}
