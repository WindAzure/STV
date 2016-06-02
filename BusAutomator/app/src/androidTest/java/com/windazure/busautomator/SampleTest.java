package com.windazure.busautomator;

//import android.support.test.uiautomator.UiAutomatorTestCase;
import android.provider.Settings;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.test.InstrumentationTestCase;
import android.util.Log;

public class SampleTest extends InstrumentationTestCase {
    private UiDevice device=null;

    @Override
    public void setUp()
    {
        device=UiDevice.getInstance(getInstrumentation());
    }

    @Override
    public void tearDown()
    {
        device.pressBack();
    }

    public void testCase1() throws UiObjectNotFoundException
    {
        UiObject Calculator =  device.findObject(new UiSelector().description("Calculator"));
        Calculator.clickAndWaitForNewWindow();

        UiObject seven = device.findObject(new UiSelector().resourceId("com.android.calculator2:id/digit_7"));
        seven.click();

        UiObject plus = device.findObject(new UiSelector().resourceId("com.android.calculator2:id/op_add"));
        plus.click();

        UiObject one =device.findObject(new UiSelector().resourceId("com.android.calculator2:id/digit_1"));
        one.click();

        UiObject result = device.findObject(new UiSelector().resourceId("com.android.calculator2:id/eq"));
        result.click();
    }
}
