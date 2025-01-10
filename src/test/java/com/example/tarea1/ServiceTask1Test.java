package com.example.tarea1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceTask1Test {

    private final ServiceTask1 serviceTask1 = new ServiceTask1();

    @Test
    void testGetTask1() {
        String result = serviceTask1.getTask1();
        assertEquals("Hello World", result, "getTask1() should return 'Hello World'");
    }

    @Test
    void testPost() {
        String result = serviceTask1.post();
        assertEquals("Hello World", result, "post() should return 'Hello World'");
    }

    @Test
    void testPut() {
        String result = serviceTask1.put();
        assertEquals("Updated Hello World", result, "put() should return 'Updated Hello World'");
    }

    @Test
    void testDelete() {
        String result = serviceTask1.delete();
        assertEquals("Deleted", result, "delete() should return 'Deleted'");
    }
}
