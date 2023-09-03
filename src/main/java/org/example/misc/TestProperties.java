package org.example.misc;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestProperties {

    @Test
    @Tag("SSS")
    void test() {

        System.out.println(System.getProperty("url"));

    }
}
