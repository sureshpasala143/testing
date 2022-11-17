package MavenPractice.MavenPracticeTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testClass {
@Test
public void sum(){
	int a=10;
	int b=1;
	System.out.println("sum");
	Assert.assertEquals(11, a+b);
}
@Test
public void diff(){
	int a=10;
	int b=1;
	System.out.println("Diff");
	Assert.assertEquals(9, a-b);
}
@Test
public void div(){
	int a=10;
	int b=1;
	System.out.println("div");
	Assert.assertEquals(9, a/b);
}
}
