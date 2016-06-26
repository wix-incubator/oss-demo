package com.wixpress.demo.oss;

import java.time.Instant;

/**
 * Created by boazc on 26/06/2016.
 */
public class TimeService {

    public String now() {
        return Instant.now().toString();
    }
}
