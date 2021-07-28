package TestNG;



	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class AfterClass 
	{
		@BeforeClass
		public void bc()
		{
			System.out.println("Before c");
		}

		@BeforeMethod
		public void bm()
		{
			System.out.println("Before M");
		}
		@Test
		public void tc1()
		{
			System.out.println("hello...! 1");
		}
		@Test
		public void tc2()
		{
			System.out.println("hello...! 2");
		}
		@AfterMethod
		public void am()
		{
			System.out.println("After  m");
		}
		
		//@AfterClass
		public void ac()
		{
			System.out.println("After  m");
		}
		
		
	}



