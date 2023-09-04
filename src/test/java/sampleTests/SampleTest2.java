package sampleTests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest2 {

	@Test
	public void test1() {
		Reporter.log("Test1");
	}
	
	@Test
	public void test2() {
		Reporter.log("Test2");
	}
}
