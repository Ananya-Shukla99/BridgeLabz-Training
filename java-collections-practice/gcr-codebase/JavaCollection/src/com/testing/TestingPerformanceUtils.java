package com.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TestingPerformanceUtils {

    @Test
    @Timeout(2) 
    void testLongRunningTaskTimeout() throws InterruptedException {
        PerformanceUtils.longRunningTask();
    }
}
