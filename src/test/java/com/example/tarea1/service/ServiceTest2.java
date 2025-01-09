package com.example.tarea1.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ServiceTest2 {
    @Test
    void contextLoads() {


    }

    @Test
    void testServiceTestOnly() {
        String result = "Hello World2";
        assertEquals("Hello World", result, "getTask1() should return 'Hello World'");
    }
}
