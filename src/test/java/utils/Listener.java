package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {



    public void onTestSuccess(ITestResult result) {
        System.out.println("Test " + result.getName() + " success");
    }

    public void onStart(ITestContext context) {
        System.out.println("Test started");
    }

    public void onFinish(ITestContext context) {
        System.out.println("Test finished");

    }
}
