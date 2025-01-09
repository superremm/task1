package com.example.tarea1.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTask3Test {

    private final ServiceTask3 serviceTask3 = new ServiceTask3();

    @Test
    void testGetTask2() {
        String result = serviceTask3.getTask2();
        assertEquals("Hello ServiceTask3", result, "The getTask2 method should return 'Hello ServiceTask3'");
    }

    @Test
    void testPost() {
        String result = serviceTask3.post();
        assertEquals("Post ServiceTask3", result, "The post method should return 'Post ServiceTask3'");
    }

    @Test
    void testPut() {
        String result = serviceTask3.put();
        assertEquals("Updated ServiceTask3", result, "The put method should return 'Updated ServiceTask3'");
    }

    @Test
    void testDelete() {
        String result = serviceTask3.delete();
        assertEquals("Deleted ServiceTask3", result, "The delete method should return 'Deleted ServiceTask3'");
    }
}