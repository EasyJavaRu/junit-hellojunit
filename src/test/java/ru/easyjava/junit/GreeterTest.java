package ru.easyjava.junit;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GreeterTest {
    @Test
    public void testGreet() {
        Greeter testedObject = new Greeter();
        assertEquals("Hello world!", testedObject.greet("world"));
    }
}
