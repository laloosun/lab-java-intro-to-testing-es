package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {
    @Test
    public void testCalculateSum() {
        MyClass myClass = new MyClass();
        int result = myClass.calculateSum(3, 5);
        assertEquals(8, result);
    }
}