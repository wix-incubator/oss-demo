package com.wixpress.demo.oss;

import java.time.Instant;

public class TimeService {

    public String now() {
        return Instant.now().toString();
    }
}
