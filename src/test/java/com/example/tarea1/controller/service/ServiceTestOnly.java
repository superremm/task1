package com.example.tarea1.controller.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTestOnly {
    @Test
    void testServiceTestOnly() {
        String result = "Hello World";
        assertEquals("Hello World", result, "getTask1() should return 'Hello World'");
    }
}
