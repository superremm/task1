package com.example.tarea1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceTask2Test {

    private final ServiceTask2 serviceTask2 = new ServiceTask2();

    @Test
    void testGetTask2() {
        String result = serviceTask2.getTask2();
        assertEquals("Hello ServiceTask2", result, "getTask2 should return 'Hello ServiceTask2'");
    }

    @Test
    void testPost() {
        String result = serviceTask2.post();
        assertEquals("Post ServiceTask2", result, "post should return 'Post ServiceTask2'");
    }

    @Test
    void testPut() {
        String result = serviceTask2.put();
        assertEquals("Updated ServiceTask2", result, "put should return 'Updated ServiceTask2'");
    }

    @Test
    void testDelete() {
        String result = serviceTask2.delete();
        assertEquals("Deleted ServiceTask2", result, "delete should return 'Deleted ServiceTask2'");
    }

}