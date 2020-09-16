package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Resources.browserdetails;
import Resources.listener;
@Listeners(listener.class)
public class test1 extends browserdetails{
	
	@Test
	public void home() throws IOException
	{
		driver=browser();
		driver.get(prob.getProperty("url"));
	}
	
	@Test
	public void homepage() throws IOException
	{
		driver=browser();
		driver.get(prob.getProperty("url"));
		Assert.assertEquals(false, true);
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
