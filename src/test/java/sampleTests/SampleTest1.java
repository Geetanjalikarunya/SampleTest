package sampleTests;

import org.testng.Reporter;
import org.testng.annotations.Test;
//This is a test
public class SampleTest1 {

	@Test
	public void test1() {
		Reporter.log("Test1");
	}
	
	@Test
	public void test2() {
		Reporter.log("Test2");
	}
}
