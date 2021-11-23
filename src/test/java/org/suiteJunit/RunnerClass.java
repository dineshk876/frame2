package org.suiteJunit;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import com.pom.BaseClass;



public class RunnerClass extends BaseClass{
@Test
public void tc() throws Throwable {
	Result r = JUnitCore.runClasses(FbCreateAcc.class,FbLoginPage.class);
	if (r.wasSuccessful()==true) {
		excelWrite("Sheet2", 5, 0, "pass");
	}

}
}
