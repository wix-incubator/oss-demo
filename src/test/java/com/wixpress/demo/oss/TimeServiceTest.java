package com.wixpress.demo.oss;

import org.junit.Test;

import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertNotNull;

public class TimeServiceTest {

    @Test
    public void testNow() {
        assertNotNull(DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss.SSS'Z'").parse(new TimeService().now()));
    }

}