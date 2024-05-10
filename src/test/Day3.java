package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day3 {
@Test
public void home()
  {
	  System.out.println("home");
  }
@Test
public void office()
{
	System.out.println("office");
	
}
@AfterTest
public void playground()
{
	System.out.println("playground");
	
}

}
