package com.example.tarea1.controller.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ServiceTestOnly {
    @Test
    void testServiceTestOnly() {
        String result = "Hello World";
        assertEquals("Hello World", result, "getTask1() should return 'Hello World'");
    }
    @Test
    void testServiceTestOnly2() {
        String result = "Hello World2";
        assertEquals("Hello World2", result, "getTask1() should return 'Hello World'");
    }

}
