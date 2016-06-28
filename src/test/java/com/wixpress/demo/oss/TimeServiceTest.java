package com.wixpress.demo.oss;

import org.junit.Test;

import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertNotNull;

public class TimeServiceTest {

    @Test
    public void testNow() {
        assertNotNull(DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss.SSS'Z'").parse(new TimeService().now()));
    }

    @Test
    public void testNow2() {
        assertNotNull(DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss.SSS'Z'").parse(new TimeService().now()));
        assertNotNull(DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss.SSS'Z'").parse(new TimeService().now()));
    }

    @Test
    public void testNow3() {
        assertNotNull(DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss.SSS'Z'").parse(new TimeService().now()));
    }

    @Test
    public void testNow4() {
        assertNotNull(DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss.SSS'Z'").parse(new TimeService().now()));
    }

    @Test
    public void testNow5() {
        assertNotNull(DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss.SSS'Z'").parse(new TimeService().now()));
    }

}